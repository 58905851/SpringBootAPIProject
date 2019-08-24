package com.example.demo.entities;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Tickets")
public class Tickets {
	
	@Id
	@Column(name="ticketId")
	private Integer ticketId;
	
	@Column(name="sStation")
	private String sStation;

	@Column(name="dStation")
	private String dStation;
	
	@Column(name="doj")
	private Date doj;
	
	@Column(name="trainName")
	private String trainName;
	
	@Column(name="trainNo")
	private String trainNo;
	
	@OneToOne(mappedBy = "tickets")
	@JsonBackReference
    private  Passanger passanger;
	
	public Tickets() {
		
	}

	public Tickets(Integer ticketId, String sStation, String dStation, Date doj, String trainName, String trainNo) {
		super();
		this.ticketId = ticketId;
		this.sStation = sStation;
		this.dStation = dStation;
		this.doj = doj;
		this.trainName=trainName;
		this.trainNo= trainNo;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getsStation() {
		return sStation;
	}

	public void setsStation(String sStation) {
		this.sStation = sStation;
	}

	public String getdStation() {
		return dStation;
	}

	public void setdStation(String dStation) {
		this.dStation = dStation;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
	
	
	
}
