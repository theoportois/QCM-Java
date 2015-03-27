package qcm.controllers;

import javax.swing.JOptionPane;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import qcm.views.MainView;

public class MainController {
	private MainView view;
	
	
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
			}
		});
		
		
		view.open();
	}
	
	
}
