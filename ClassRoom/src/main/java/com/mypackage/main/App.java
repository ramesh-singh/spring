package com.mypackage.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypackage.service.ClassRoomService;

public class App{
    public static void main( String[] args ){
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/service.xml", "classpath:spring/model.xml");
    	ClassRoomService classRoomService= (ClassRoomService) context.getBean("classRoomService");
    	
    	classRoomService.teaching();
    }
    
}
