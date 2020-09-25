package com.Babbar.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Babbar.model.PartyDetailRowMapper;
import com.Babbar.model.PartyDetails;
import com.Babbar.model.PurchaseDetails;

@Repository
public class CementDaoImpl implements CementDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	//public PurchaseDetails getCustomerDetails(String customer) {
//		PurchaseDetails pr= new PurchaseDetails();
//		pr.setPartyName(customer);
//		pr.setDateOfPurchase(LocalDateTime.now());
//		pr.setPricePerBag(320);
//		pr.setQuantityPurchased(100);
//		return pr;
//	}

	public void addParty(PartyDetails partyDetails) {
		String query="Insert into Persons(PartId,PartyName,PartyAddress) Values(?,?,?)";
		jdbcTemplate.update(query, partyDetails.getPartId(),partyDetails.getPartyName(),partyDetails.getPartyLocation());
	}

	@Override
	public void addOrder(PurchaseDetails purchaseDetails) {
		int total=(int) (purchaseDetails.getPricePerBag()*purchaseDetails.getQuantityPurchased());
		String query="Insert into Orders(PartyName,QuantityPurchased,PricePerBag,Total,DateOfPurchase)Values(?,?,?,?,?)";
		jdbcTemplate.update(query, purchaseDetails.getPartyName(),purchaseDetails.getQuantityPurchased(),purchaseDetails.getPricePerBag(),total,purchaseDetails.getDateOfPurchase());
		
	}

	@Override
	public List<PurchaseDetails> viewPartyDetail(String partyName) {
		String query1="Select * from"+partyName;
		List<PurchaseDetails> partyDetail=jdbcTemplate.query(query1, new PartyDetailRowMapper());
		return partyDetail;
	}

}
