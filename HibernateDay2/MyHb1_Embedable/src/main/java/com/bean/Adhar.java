package com.bean;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Adhar implements Serializable{

	private int adharId;
	private String fingurePrint;
	
	
	public Adhar() {
		// TODO Auto-generated constructor stub
	}
	public Adhar(int adharId, String fingurePrint) {
		super();
		this.adharId = adharId;
		this.fingurePrint = fingurePrint;
	}
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public String getFingurePrint() {
		return fingurePrint;
	}
	public void setFingurePrint(String fingurePrint) {
		this.fingurePrint = fingurePrint;
	}
	@Override
	public String toString() {
		return "Adhar [adharId=" + adharId + ", fingurePrint=" + fingurePrint
				+ "]";
	}

	
	
}
