package com.Babbar.model;

import java.util.Date;
import java.time.LocalDateTime;

public class PurchaseDetails {
	
	private String partyName;
	private int quantityPurchased;
	private int pricePerBag;
	private double totalPrice;
	private Date dateOfPurchase;
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	public int getPricePerBag() {
		return pricePerBag;
	}
	public void setPricePerBag(int pricePerBag) {
		this.pricePerBag = pricePerBag;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date date) {
		this.dateOfPurchase = date;
	}
	

}
