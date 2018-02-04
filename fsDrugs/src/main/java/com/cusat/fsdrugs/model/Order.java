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
@Table(name ="order_table")
public class Order  implements Serializable{
	
	private static final long serialVersionUID = -1222219418741718682L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	BigInteger orderId;
	
	@NotNull
	@Column(name= "product_id")
	BigInteger productId;
	
	@NotNull
	@Column(name= "user_id")
	BigInteger userId;
	
	@NotNull
	@Column(name= "sellert_id")
	BigInteger sellerId;
	
	@NotNull
	@Column(name= "total_item")
	String totalitem;
	
	@NotNull
	@Column(name= "price")
	String price;
	
	@NotNull
	@Column(name="sold_product")
	String soldproduct;

	@NotNull
	@Column(name = "sold_date")
	String solddate;

	@NotNull
	@Column(name="order_date")
	String orderdate;
	
	@NotNull
	@Column(name= "cancel_date")
	String canceldate;
	
	@NotNull
	@Column(name= "status")
	String status;
	
	public BigInteger getOrderId() {
		return orderId;
	}

	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}

	public BigInteger getProductId() {
		return productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

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

	public String getTotalitem() {
		return totalitem;
	}

	public void setTotalitem(String totalitem) {
		this.totalitem = totalitem;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSoldproduct() {
		return soldproduct;
	}

	public void setSoldproduct(String soldproduct) {
		this.soldproduct = soldproduct;
	}

	public String getSolddate() {
		return solddate;
	}

	public void setSolddate(String solddate) {
		this.solddate = solddate;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getCanceldate() {
		return canceldate;
	}

	public void setCanceldate(String canceldate) {
		this.canceldate = canceldate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}