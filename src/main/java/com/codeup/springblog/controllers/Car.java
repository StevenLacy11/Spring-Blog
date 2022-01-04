package com.codeup.springblog.controllers;


import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "brand", nullable = false, length = 50)
	private String make;

	@Column(name = "model", nullable = false, length = 50)
	private String model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

