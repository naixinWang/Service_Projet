package com.boutique.application.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot {
	
	private App app;

	public void boot(){
	      ApplicationContext context = 
      new ClassPathXmlApplicationContext("app-context.xml");
		 app = (App)context.getBean(App.class);
	}

	public App getApp() {
		return app;
	}
	
}
