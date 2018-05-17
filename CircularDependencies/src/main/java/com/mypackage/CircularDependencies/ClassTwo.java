package com.mypackage.CircularDependencies;

public class ClassTwo {
	private ClassOne classOne;

	public ClassOne getClassOne() {
		return classOne;
	}

	public void setClassOne(ClassOne classOne) {
		this.classOne = classOne;
	}
	
	/*public ClassTwo(ClassOne classOne){
		this.classOne= classOne;
	}*/
	
	

}
