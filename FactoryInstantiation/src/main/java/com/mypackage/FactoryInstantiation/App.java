package com.mypackage.FactoryInstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypackage.FactoryInstantiation.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/service.xml");
        User user= context.getBean("user", User.class);
        
        user.display();
    }
}
