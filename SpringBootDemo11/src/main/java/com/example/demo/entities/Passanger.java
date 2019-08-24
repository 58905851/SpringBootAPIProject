package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Passanger")
public class Passanger {
	
	@Id
	@Column(name="passId")
	private Integer passId;
	
	@Column(name="passName")
	private String passName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="adhaarNo")
	private String adhaarNo;
	
	@Column(name="className")
	private String className;
	
	@Column(name="tId")
	private Integer tId;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="tId", referencedColumnName = "ticketId", insertable = false, updatable =false)
	 /*
	  * You have an infinite recursion going on during serialization since Passanger refers to Tickets and Tickets refer to Passanger.
	  *  You can stop it by adding  @JsonManagedReference and @JsonBackReference
	  */
	 @JsonManagedReference
	 private Tickets tickets;

	
	public Tickets getTickets() {
		return tickets;
	}

	public void setTickets(Tickets tickets) {
		this.tickets = tickets;
	}

	public Passanger() {
		
	}

	public Passanger(Integer passId, String passName, Integer age, String adhaarNo, String className, Tickets tickets, Integer tId) {
		this.passId = passId;
		this.passName = passName;
		this.age = age;
		this.adhaarNo = adhaarNo;
		this.className = className;
		this.tickets=tickets;
		this.tId=tId;
	}

	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}
	
	

}
