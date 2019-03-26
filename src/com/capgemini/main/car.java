package com.capgemini.main;

public class car implements Comparable<car>{
	private String make;
	private String model;
	private double year;
	private double price;

	public car() {
		super();
		
	}

	public car(String make, String model, double year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

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

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
    @Override
    public int compareTo(car obj) {
    	return this.make.compareTo(obj.model);
    }
	 
}
