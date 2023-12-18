package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestAppCont {
	
	public static void main(String[] args) {
		
		 ConfigurableApplicationContext appCont=new ClassPathXmlApplicationContext("person");

	     Person per=(Person)appCont;
	     
	     per.message();
	}
	

}
