package com.mypackage.FactoryInstantiation.factory;

import com.mypackage.FactoryInstantiation.model.User;

public class UserFactoryAdvanced {
	
	public User getUserInstance(){
		return new User();
	}

}
