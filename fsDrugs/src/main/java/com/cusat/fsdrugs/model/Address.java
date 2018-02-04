package com.cusat.fsdrugs.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address implements Serializable	{
	private static final long serialVersionUID = 8531407232830842933L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	BigInteger userId;
	
	@NotNull
	@Column(name = "house_number")
	String housenumber;
	
	@NotNull
	@Column(name = "street")
	String street;
	
	@NotNull
	@Column(name = "landmark")
	String landmark;
	
	@NotNull
	@Column(name = "city")
	String city;
	
	@NotNull
	@Column(name = "state")
	String state;
	
	@NotNull
	@Column(name = "pin")
	String pin;
	
	@NotNull
	@Column(name = "country")
	String country;

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}