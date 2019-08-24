package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="FindTrainBetweenStation")
public class FindTrainBetweenStation {
	
	@Id
	@Column(name="ftbsId")
	private Integer ftbsId;
	
	@Column(name="sStation")
	private String sStation;

	@Column(name="dStation")
	private String dStation;
	
	@Column(name="trainName")
	private String trainName;
	
	@Column(name="trainNo")
	private String trainNo;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="doj")
	private Date doj;

	public FindTrainBetweenStation() {
		
	}

	public FindTrainBetweenStation(Integer ftbsId, String sStation, String dStation, Date doj, String trainName, String trainNo) {
		super();
		this.ftbsId = ftbsId;
		this.sStation = sStation;
		this.dStation = dStation;
		this.doj = doj;
		this.trainName=trainName;
		this.trainNo=trainNo;
	}

	
	public Integer getFtbsId() {
		return ftbsId;
	}

	public void setFtbsId(Integer ftbsId) {
		this.ftbsId = ftbsId;
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
	
	

}
