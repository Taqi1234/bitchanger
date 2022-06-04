package com.student.beans;

public class UserBean {
	
	private int id;
	
	private String name;
	
	private String phoneNo;
	
	private String filePath;


	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public UserBean(int id, String name, String phoneNo,String filePath) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.filePath = filePath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
