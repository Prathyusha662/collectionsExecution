package com.xworkz.collectionspractice.dao;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.dto.FlightDTO;

public interface FlightDAO {
	public boolean save(FlightDTO dto);

	boolean findByName(FlightNames name);

	boolean updatePriceByName(double price, FlightNames name);

	boolean deleteByName(FlightNames name);

	int flightSize();

}
