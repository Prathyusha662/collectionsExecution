package com.xworkz.collectionspractice.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.dto.FlightDTO;

public class FlightDAOImpl implements FlightDAO {
	private List<FlightDTO> flightList;

	public FlightDAOImpl(List<FlightDTO> flightDTOs) {
		System.out.println("invoking  FlightDAOImpl");
		this.flightList = flightDTOs;
	}

	@Override
	public boolean save(FlightDTO dto) {
		System.out.println("invoking save method");
		boolean added = this.flightList.add(dto);
		System.out.println("added" + added);
		return added;
	}

	@Override
	public boolean findByName(FlightNames name) {
		System.out.println("invoking findByName");
		System.out.println("flightnames" + name);
		for (FlightDTO flightDTO : this.flightList) {
			FlightNames name1 = flightDTO.getName();
			if (name1.equals(name)) {
				System.out.println(" name found");
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean updatePriceByName(double price, FlightNames name) {
		System.out.println("invoking updatePriceByName ");
		System.out.println("price " + price);
		System.out.println("name" + name);
		FlightDTO dto = this.findByName(name)
		if (dto != null) {
			System.out.println("can update , name is found");
			dto.setName(name);
			return true;
		} else {
			System.out.println("cannot update , name not found");
		}
		return false;
	}

	@Override
	public boolean deleteByName(FlightNames name) {
		System.out.println("delete by name");
		System.out.println("name" + name);
		Iterator<FlightDTO> iterator = this.flightList.iterator();
		while (iterator.hasNext()) {
			FlightDTO dto = iterator.next();
			if (dto.getName().equals(name)) {
				iterator.remove();
				return true;
			}
		}

		return false;
	}

	@Override
	public int flightSize() {
		int total = flightList.size();
		System.out.println("size is" + total);
		return total;
	}

}
