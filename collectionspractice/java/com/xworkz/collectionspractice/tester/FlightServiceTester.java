package com.xworkz.collectionspractice.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.constants.Type;
import com.xworkz.collectionspractice.dao.FlightDAO;
import com.xworkz.collectionspractice.dao.FlightDAOImpl;
import com.xworkz.collectionspractice.dto.FlightDTO;
import com.xworkz.collectionspractice.service.FlightService;
import com.xworkz.collectionspractice.service.FlightServiceImpl;

public class FlightServiceTester {

	public static void main(String[] args) {
		FlightDTO dto = new FlightDTO(FlightNames.DECCAN_AIRWAYS, Type.BUSSINESS, 2300, "gr123ed", true);

		List<FlightDTO> dt = new ArrayList<FlightDTO>();
		FlightDAO dao = new FlightDAOImpl(dt);
		FlightService service = new FlightServiceImpl(dao);
		service.validateAndSave(dto);
	}
}
