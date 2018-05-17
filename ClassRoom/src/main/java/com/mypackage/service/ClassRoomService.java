package com.mypackage.service;

import com.mypackage.model.ClassRoom;

public class ClassRoomService {
	private ClassRoom classRoom;

	public ClassRoom getClassroom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	
	public void displayClassInfo(){
		classRoom.displayClassInfo();
	}

}
