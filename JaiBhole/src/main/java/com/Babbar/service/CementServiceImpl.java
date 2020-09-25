package com.Babbar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Babbar.dao.CementDao;
import com.Babbar.model.PartyDetails;
import com.Babbar.model.PurchaseDetails;

@Service
public class CementServiceImpl implements CementService {
	
	@Autowired
	public CementDao cementDaoImpl;
	
	
//	public int getTotalAmount(String partyName) {
//		PurchaseDetails purchaseDetails=cementDaoImpl.getCustomerDetails(partyName);
//		int amount= (int) (purchaseDetails.getPricePerBag()*purchaseDetails.getQuantityPurchased());
//		return amount;
//		
//	}
	
	
	public void addPartyDetail(PartyDetails partyDetails) {
		cementDaoImpl.addParty(partyDetails);
	}


	@Override
	public void addOrderDetails(PurchaseDetails purchaseDetail) {
		cementDaoImpl.addOrder(purchaseDetail);
		
	}


	@Override
	public List<PurchaseDetails> viewPartyDetails(String partyName) {
		return cementDaoImpl.viewPartyDetail(partyName);
		
	}


}
