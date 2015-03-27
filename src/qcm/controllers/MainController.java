package qcm.controllers;

import qcm.views.MainView;

public class MainController {
	private MainView view;
	
	
	public MainController(MainView view) {
		super();
		this.view = view;
	}
	
	public void init(){
		view.init();	
		
		view.open();
	}
	
	
}
