package com.mypackage.FactoryInstantiation.factory;

import com.mypackage.FactoryInstantiation.model.User;

public class UserFactory {
	
	private UserFactory(){
		
	}
	
	public static User getUserInstance(){
		return new User();
	}

}
