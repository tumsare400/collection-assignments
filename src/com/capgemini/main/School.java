package com.capgemini.main;

import java.util.Objects;

public class School {
	private String schoolName;
	private String schoolCity;
	private String schoolsDistrict;
	private String greatSchoolRanking;

	public School() {
		super();

	}

	public School(String schoolName, String schoolCity, String schoolsDistrict, String greatSchoolRanking) {
		super();
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.schoolsDistrict = schoolsDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolsDistrict() {
		return schoolsDistrict;
	}

	public void setSchoolsDistrict(String schoolsDistrict) {
		this.schoolsDistrict = schoolsDistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
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
		
		
		School school = (School) obj;
		if(this.schoolName==school.schoolName && this.schoolCity==school.schoolCity && this.schoolsDistrict==school.schoolsDistrict) {
			return true;
		}
	
		return false;
	}

	

     @Override
	public int hashCode() {
		return Objects.hash(schoolName, schoolCity, schoolsDistrict);
	}
}
