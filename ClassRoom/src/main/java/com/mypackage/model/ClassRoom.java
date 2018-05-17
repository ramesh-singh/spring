package com.mypackage.model;

public class ClassRoom {
	private int numberOfStudents;
	private int numberOfTeachersAssigned;
	private Teacher currentTeacher;
	
	public ClassRoom(int numberOfStudents, int numberOfTeachersAssigned, Teacher currentTeacher){
		this.numberOfStudents= numberOfStudents;
		this.numberOfTeachersAssigned= numberOfTeachersAssigned;
		this.currentTeacher= currentTeacher;
	}
	
	public void displayClassInfo(){
		System.out.println("Number of students in the class: "+numberOfStudents);
		System.out.println("Number of teachers assigned to this class: "+numberOfTeachersAssigned);
		System.out.println("Please start teaching.");
		currentTeacher.teach();
	}

}
