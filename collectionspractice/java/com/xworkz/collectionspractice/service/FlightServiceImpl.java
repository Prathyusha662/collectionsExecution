package com.xworkz.collectionspractice.service;

import com.xworkz.collectionspractice.dao.FlightDAO;
import com.xworkz.collectionspractice.dto.FlightDTO;

public class FlightServiceImpl implements FlightService {
	private FlightDAO dao;

	public FlightServiceImpl(FlightDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(FlightDTO dto) {
		System.out.println("invoking  validateAndSave");
		System.out.println("dtois"+dto);
		boolean valid = false;
		if (dto != null) {
 double price=dto.getPrice();
 if(price>1350&&price<4000) {
	 System.out.println("price is valid");
	 valid=true;
 }
	 else 
	 {
		 System.out.println("price is invalid");
		 valid=false;
	 }
 
 String id=dto.getFlightId();
 if(valid) {
 if(id!=null&&!id.contains("  ")&&!id.contains("")&&!id.isEmpty()) {
	 
	 System.out.println("Flightid ids valid");
	 valid=true;
 }
 else {
	 System.out.println("id is invalid");
	 valid=false;
 }
		}
		if (valid) {
			System.out.println("dto is valid, can save");
			dao.save(dto);
		}
		
		else {
			System.out.println("dto is invalid , cannot save");
	
		}
		}
		return false;
	}
}