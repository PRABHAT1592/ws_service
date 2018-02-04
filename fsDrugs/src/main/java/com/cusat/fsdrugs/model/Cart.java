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
@Table(name= "cart")
public class Cart implements Serializable	{
	

	private static final long serialVersionUID = 3311554271051603803L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	BigInteger cartId;
	
	@NotNull
	@Column(name= "user_id")
	BigInteger userId;
	
	@NotNull
	@Column(name= "seller_id")
	BigInteger sellerid;
	
	@NotNull
	@Column(name = "total_item")
	String totalitem;

	@NotNull
	@Column(name = "total_price")
	String totalprice;

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	
	public BigInteger getCartId() {
		return cartId;
	}

	public void setCartId(BigInteger cartId) {
		this.cartId = cartId;
	}

	public BigInteger getSellerid() {
		return sellerid;
	}

	public void setSellerid(BigInteger sellerid) {
		this.sellerid = sellerid;
	}

	public String getTotalitem() {
		return totalitem;
	}

	public void setTotalitem(String totalitem) {
		this.totalitem = totalitem;
	}

	public String getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
		
}