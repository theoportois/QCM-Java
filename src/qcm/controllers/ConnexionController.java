package qcm.controllers;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import qcm.gson.TestGson;
import qcm.http.TestHttp;
import qcm.models.Connexion;
import qcm.models.Domaine;
import qcm.models.User;
import qcm.views.ConnexionView;
import qcm.views.MainView;



public class ConnexionController {
	private ConnexionView view;
	private Connexion connect;
	
	
	public Connexion getConnect() {
		return connect;
	}
	public ConnexionController(ConnexionView view) {
		super();
		this.view = view;
	}
	
	public void init(){
		view.init();
		view.getBtnConnexion().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TestHttp http=new TestHttp();
				TestGson gson=new TestGson();
				User user =new User();
				user.setMail(view.getTextMail().getText());
				user.setPassword(view.getTextPassword().getText());
				try {
					String connectResponse=http.postJSON(http.getBaseUrl()+"user/connect", user);
					System.out.println(connectResponse);
					connect =gson.jsonToConnect(connectResponse);
					String domaines=http.get(http.getBaseUrl()+"domaines", connect.getToken());
					
					

				} catch (ClientProtocolException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println(connect.getToken());
				//on test si c'est les bonnes id
				if(connect.getToken()!=null){
					//JOptionPane.showMessageDialog(null, "Vous êtes désormais connecté.");
					view.close();
					MainController controller=new MainController(new MainView());
					controller.init();
					
				}else{
					System.out.println("nope");
				} 
				
				
				
			}
			
		});
		view.open();

	}
	
	
}
