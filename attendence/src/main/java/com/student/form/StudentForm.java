package com.student.form;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}