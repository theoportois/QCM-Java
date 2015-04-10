package qcm.controllers;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import qcm.gson.TestGson;
import qcm.http.TestHttp;
import qcm.models.Connexion;
import qcm.views.MainView;

public class MainController {
	private MainView view;
	//private Connexion connexion;
	
	public MainController(MainView view) {
		super();
		this.view = view;
	}
	
	public void init(){
		view.init();	

		view.getBtnTest().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("blblb");
				
//				TestHttp http=new TestHttp();
//				TestGson gson=new TestGson();
//				
//				try {
//					String domaine=http.get(http.getBaseUrl()+"domaine", connexion.getToken());
//					System.out.println(domaine);
//					
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
				
			}
		});
		
		
		view.open();
	}
	
	
}
