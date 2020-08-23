package com.sapient.publicis.week2;

public class SummaryObj {

	private String Place;
	private String gender;
	private Double avg_salary;

	public SummaryObj(String place, String gender, Double avg_salary) {
		super();
		Place = place;
		this.gender = gender;
		this.avg_salary = avg_salary;
	}

	@Override
	public String toString() {
		return "\nPlace=" + Place + ", gender=" + gender + ", avg_salary=" + avg_salary;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getAvg_salary() {
		return avg_salary;
	}

	public void setAvg_salary(Double avg_salary) {
		this.avg_salary = avg_salary;
	}
}
