package com.Babbar.service;

import java.util.List;

import com.Babbar.model.PartyDetails;
import com.Babbar.model.PurchaseDetails;


public interface CementService {

	//public int getTotalAmount(String partyName);
	public void addPartyDetail(PartyDetails partyDetails);
	public void addOrderDetails(PurchaseDetails purchaseDetail);
	public List<PurchaseDetails> viewPartyDetails(String partyName);
}
