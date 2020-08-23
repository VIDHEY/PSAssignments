package com.sapient.publicis.week2;

public class IncomeData {
	private String city;
	private String country;
	private String gender;
	private String currency;
	private Double amount;

	@Override
	public String toString() {
		return "IncomeData [city=" + city + ", country=" + country + ", gender=" + gender + ", currency=" + currency
				+ ", income=" + amount + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public IncomeData() {
		super();
	}

	public IncomeData(String city, String country, String gender, String currency, Double amount) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.currency = currency;
		this.amount = amount;
	}
	
}
