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
@Table(name ="user")
public class User implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3289571114069964781L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	BigInteger userId;
	
	@NotNull
	@Column(name = "first_name")
	String firstName;
	
	@NotNull
	@Column(name = "middle_name")
	String middleName;

	@NotNull
	@Column(name = "last_name")
	String lastName;
	
	@NotNull
	@Column(name = "gender")
	String gender;
	
	@NotNull
	@Column(name = "dob")
	String dob;
	
	
	@NotNull
	@Column(name = "email")
	String email;
	
	@NotNull
	@Column(name = "phone")
	String phone;
	
	@NotNull
	@Column(name = "password")
	String password;
	
	
	@NotNull
	@Column(name = "conpassword")
	String conpassword;


	public BigInteger getUserId() {
		return userId;
	}


	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConpassword() {
		return conpassword;
	}


	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}

	
}
