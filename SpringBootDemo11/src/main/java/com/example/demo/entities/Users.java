package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	@Id
	@Column(name="userId")
	private Integer userId;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="fName")
	private String fName;
	
	@Column(name="lName")
	private String lName;
	
	@Column(name="mobileNo")
	private String mobileNo;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pin")
	private String pin;

	public Users() {
	}

	public Users(Integer userId, String fName, String lName, String mobileNo, String emailId, String country,
			String state, String city, String pin, String Password) {
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.Password=Password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
