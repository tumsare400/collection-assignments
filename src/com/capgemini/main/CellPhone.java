package com.capgemini.main;

import java.util.Objects;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;

	public CellPhone() {
		super();

	}

	public CellPhone(String company, String model, String description, String operatingSystem,  int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
   
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof CellPhone) {
			return false;
		}
		
		
		CellPhone cellphone = (CellPhone) obj;
		if(this.company==cellphone.company && this.model==cellphone.model) {
			return true;
		}
	
		return false;
	}

	

     @Override
	public int hashCode() {
		return Objects.hash(company, model);
	}
}
