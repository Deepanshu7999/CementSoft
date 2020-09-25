package com.Babbar.dao;

import java.util.List;

import com.Babbar.model.PartyDetails;
import com.Babbar.model.PurchaseDetails;

public interface CementDao {
	
	//public PurchaseDetails getCustomerDetails(String customer);
	public void addParty(PartyDetails partDetails);
	public void addOrder(PurchaseDetails purchaseDetails);
	public List<PurchaseDetails> viewPartyDetail(String partyName);

}
