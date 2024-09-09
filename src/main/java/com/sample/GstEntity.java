package com.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Gst_table")
public class GstEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int hsnCode;
	private int percentage;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}	
	

}
