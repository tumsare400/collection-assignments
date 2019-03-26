package com.capgemini.main;

import java.util.Objects;

public class Student implements  Comparable<Student> {
	
	private String studentName;
	private int rollNo;
	private String studentCity;
	private String studentFavouriteFruit;

	public Student() {
		super();

	}

	public Student(java.lang.String studentName, int rollNo, java.lang.String studentCity,
			java.lang.String studentFavouriteFruit) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentCity = studentCity;
		this.studentFavouriteFruit = studentFavouriteFruit;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentFavouriteFruit() {
		return studentFavouriteFruit;
	}

	public void setStudentFavouriteFruit(String studentFavouriteFruit) {
		this.studentFavouriteFruit = studentFavouriteFruit;
	}

	
	 
	  @Override
	    public int compareTo(Student obj) {
	    	return this.studentName.compareTo(obj.studentCity);
	    }
	  
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if(obj instanceof Student) {
				return false;
			}
			
			
			Student students = (Student) obj;
			if(this.studentName==students.studentName && this.studentCity==students.studentCity ) {
				return true;
			}
		
			return false;
		}

		

	     @Override
		public int hashCode() {
			return Objects.hash(studentName, studentCity);
		}
}