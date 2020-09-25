package com.Babbar.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PartyDetailRowMapper implements RowMapper<PurchaseDetails> {

	@Override
	public PurchaseDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		PurchaseDetails pr = new PurchaseDetails();
		pr.setPartyName(rs.getString("PartyName"));
		pr.setQuantityPurchased(rs.getInt("QuantityPurchased"));
		pr.setPricePerBag(rs.getInt("PricePerBag"));
		pr.setDateOfPurchase(rs.getDate("DateOfPurchase"));
		pr.setTotalPrice(rs.getDouble("Total"));
		return null;
	}

	
}
