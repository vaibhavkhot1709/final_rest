package com.final_rest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Garden {

	@Id
	int id;
	
	@Column
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "frt_id")
	Fruits fruit;

	public Garden() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garden(int id, String name, Fruits fruit) {
		super();
		this.id = id;
		this.name = name;
		this.fruit = fruit;
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

	public Fruits getFruit() {
		return fruit;
	}

	public void setFruit(Fruits fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "Garden [id=" + id + ", name=" + name + ", fruit=" + fruit + "]";
	}
	
	
}
