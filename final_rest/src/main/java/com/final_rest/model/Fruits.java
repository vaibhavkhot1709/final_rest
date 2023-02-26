package com.final_rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruits {

	@Id
	int frt_id;
	@Column
	int frt_price;
	@Column
	String frt_name;

	
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getFrt_id() {
		return frt_id;
	}


	public void setFrt_id(int frt_id) {
		this.frt_id = frt_id;
	}


	public int getFrt_price() {
		return frt_price;
	}


	public void setFrt_price(int frt_price) {
		this.frt_price = frt_price;
	}


	public String getFrt_name() {
		return frt_name;
	}


	public void setFrt_name(String frt_name) {
		this.frt_name = frt_name;
	}


	@Override
	public String toString() {
		return "Fruits [frt_id=" + frt_id + ", frt_price=" + frt_price + ", frt_name=" + frt_name + "]";
	}
	
	
	
}
