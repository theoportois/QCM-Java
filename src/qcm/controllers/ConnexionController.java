package qcm.controllers;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import qcm.gson.TestGson;
import qcm.http.TestHttp;
import qcm.models.Connexion;
import qcm.models.User;
import qcm.views.ConnexionView;



public class ConnexionController {
	private ConnexionView view;

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
					Connexion connect =gson.jsonToConnect(connectResponse);
					
					if (connect.getToken()!=null){
						System.out.println("ouvrir");
					}else{
						System.out.println("nope");
					}
					

				} catch (ClientProtocolException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
				
				
			}
			
		});
		view.open();

	}
	
	
}
