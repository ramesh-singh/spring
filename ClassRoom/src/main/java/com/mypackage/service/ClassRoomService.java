package com.mypackage.service;

import com.mypackage.model.Teacher;

public class ClassRoomService {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void teaching(){
		teacher.teach();
	}

}
