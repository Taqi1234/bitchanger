package com.student.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loginId;
	private String passWord;
	private String singleSelect;
	private String fname;
	private String uname;
	private String lname;
	private String email;
	private String confpass;
	private String gender;
	private String phone;
	private String city;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSingleSelect() {
		return singleSelect;
	}
	public void setSingleSelect(String singleSelect) {
		this.singleSelect = singleSelect;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getConfpass() {
		return confpass;
	}
	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


}
