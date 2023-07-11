package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener{

	public static Integer counter=0;
	public void sessionCreated(HttpSessionEvent arg0) {
		counter++;
		System.out.println("In "+counter);
	}
	
	public void sessionDestroyed(HttpSessionEvent arg0) {
		counter--;
		System.out.println("out "+counter);
	}     
}
