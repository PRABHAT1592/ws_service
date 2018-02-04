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
@Table(name ="item")
public class Item  implements Serializable{


	private static final long serialVersionUID = -43141658132548693L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	BigInteger itemId;
	
	@NotNull
	@Column(name= "item_name")
	String itemname;
	
	@NotNull
	@Column(name= "brand")
	String brand;
	
	@NotNull
	@Column(name="item_price")
	String itemprice;


	@NotNull
	@Column(name = "item_quantity")
	String itemQuantity;

	@NotNull
	@Column(name="item_image_url")
	String itemimageurl;
	
	@NotNull
	@Column(name= "item_description_short")
	String itemdescriptionshort;
	
	@NotNull
	@Column(name= "item_description_full")
	String itemdescriptionfull;
	
	@NotNull
	@Column(name= "item_creation_date")
	String itemcreationdate;
	
	@NotNull
	@Column(name= "item_modification_date")
	String itemmodificationdate;
	
	@NotNull
	@Column(name = "item_active_flag")
	String itemactiveflag;
	
	@NotNull
	@Column(name = "owner_id")
	String ownerId;
	
	
	@NotNull
	@Column(name= "owner_name")
	String ownername;


	public BigInteger getItemId() {
		return itemId;
	}


	public void setItemId(BigInteger itemId) {
		this.itemId = itemId;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getItemprice() {
		return itemprice;
	}


	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}


	public String getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public String getItemimageurl() {
		return itemimageurl;
	}


	public void setItemimageurl(String itemimageurl) {
		this.itemimageurl = itemimageurl;
	}


	public String getItemdescriptionshort() {
		return itemdescriptionshort;
	}


	public void setItemdescriptionshort(String itemdescriptionshort) {
		this.itemdescriptionshort = itemdescriptionshort;
	}


	public String getItemdescriptionfull() {
		return itemdescriptionfull;
	}


	public void setItemdescriptionfull(String itemdescriptionfull) {
		this.itemdescriptionfull = itemdescriptionfull;
	}


	public String getItemcreationdate() {
		return itemcreationdate;
	}


	public void setItemcreationdate(String itemcreationdate) {
		this.itemcreationdate = itemcreationdate;
	}


	public String getItemmodificationdate() {
		return itemmodificationdate;
	}


	public void setItemmodificationdate(String itemmodificationdate) {
		this.itemmodificationdate = itemmodificationdate;
	}


	public String getItemactiveflag() {
		return itemactiveflag;
	}


	public void setItemactiveflag(String itemactiveflag) {
		this.itemactiveflag = itemactiveflag;
	}


	public String getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}


	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

}