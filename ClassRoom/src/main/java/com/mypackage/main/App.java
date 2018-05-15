package com.mypackage.main;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.mypackage.service.ClassRoomService;

public class App{
    public static void main( String[] args ){
    	
    	//ApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/service.xml", "classpath:spring/model.xml");
    	//ClassRoomService classRoomService= context.getBean("classRoomService", ClassRoomService.class);
    	
    	GenericApplicationContext context= new GenericApplicationContext();
    	new XmlBeanDefinitionReader(context).loadBeanDefinitions("classpath:spring/service.xml", "classpath:spring/model.xml");
    	context.refresh();
    	
    	ClassRoomService classRoomService= context.getBean("classRoomService", ClassRoomService.class);
    	classRoomService.teaching();
    }
    
}
