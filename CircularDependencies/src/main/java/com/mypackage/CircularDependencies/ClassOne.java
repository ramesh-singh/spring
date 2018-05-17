package com.mypackage.CircularDependencies;

public class ClassOne {
	private ClassTwo classTwo;

	public ClassTwo getClassTwo() {
		return classTwo;
	}

	public void setClassTwo(ClassTwo classTwo) {
		this.classTwo = classTwo;
	}
	
	/*public ClassOne(ClassTwo classTwo) {
		this.classTwo= classTwo;
	}*/
	
	

}
