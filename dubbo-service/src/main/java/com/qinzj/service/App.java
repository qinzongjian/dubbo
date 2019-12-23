package com.qinzj.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF.spring/provider.xml");
		
		ctx.start();
		
		System.out.println("--------dubbo¿ªÆô--------------------------");
		
		synchronized (App.class) {
			
			try {
				App.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		ctx.close();
	}

}
