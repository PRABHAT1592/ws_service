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
@Table(name= "payment")
public class Payment implements Serializable	{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9129214222379904560L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	BigInteger paymentId;
	
	@NotNull
	@Column(name= "user_id")
	BigInteger userId;
	
	@NotNull
	@Column(name= "seller_id")
	BigInteger sellerId;
	
	@NotNull
	@Column(name= "product_id")
	BigInteger productId;
	
	
	@NotNull
	@Column(name = "amount")
	String amount;
	
	

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public BigInteger getSellerId() {
		return sellerId;
	}

	public void setSellerId(BigInteger sellerId) {
		this.sellerId = sellerId;
	}

	public BigInteger getProductId() {
		return productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public BigInteger getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(BigInteger paymentId) {
		this.paymentId = paymentId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


}

