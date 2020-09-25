package com.Babbar.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Babbar.model.PartyDetails;
import com.Babbar.model.PurchaseDetails;
import com.Babbar.service.CementService;

@Controller()
public class CementController {

	@Autowired
	public CementService cementServiceImpl;
	
	@PostMapping(value = "/addDetail")
	public void addPartyDetail(@RequestParam(value="partyId") int partyId,@RequestParam(value="partyName") String partyName,
			@RequestParam(value="partyLocation") String partyLocation) {
		PartyDetails partyDetails=new PartyDetails();
		partyDetails.setPartId(partyId);
		partyDetails.setPartyName(partyName);
		partyDetails.setPartyLocation(partyLocation);
		cementServiceImpl.addPartyDetail(partyDetails);		
	}
	
	@PostMapping(value="/addOrder")
	public void addOrder(@RequestParam(value="partyName") String partyName,
			@RequestParam(value="quantityPurchased") int quantitypurchased,
			@RequestParam(value="pricePerBag") int pricePerBag,
			@RequestParam(value="purchaseDate") String purchaseDate) throws ParseException {
		Date dateOfPurchase= new SimpleDateFormat("dd/mm/yyyy").parse(purchaseDate);
		PurchaseDetails purchaseDetails=new PurchaseDetails();
		purchaseDetails.setPartyName(partyName);
		purchaseDetails.setQuantityPurchased(quantitypurchased);
		purchaseDetails.setPricePerBag(pricePerBag);
		purchaseDetails.setDateOfPurchase(dateOfPurchase);
		cementServiceImpl.addOrderDetails(purchaseDetails);
		
	}
	
	@GetMapping(value="getPartyDetails")
	public List<PurchaseDetails> viewPartyDetail(@RequestParam(value="partyName") String partyName) {
		return cementServiceImpl.viewPartyDetails(partyName);
		
	}
}
