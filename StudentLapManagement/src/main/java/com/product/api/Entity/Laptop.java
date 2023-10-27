package com.product.api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Lap_det")
public class Laptop {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    @Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + "]";
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String model;


}
