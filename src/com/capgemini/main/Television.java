package com.capgemini.main;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private boolean enabled;
	private int price;

	public Television() {
		super();

	}

	public Television(String company, String type, boolean enabled, int  price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled = enabled;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public double getPrice() {
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
		if(obj instanceof Television) {
			return false;
		}
	
		Television television = (Television) obj;
		if(this.company==television.company && this.type==television.type) {
			return true;
		}
	
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company, type);
		
	}
}
