package com.xworkz.collectionspractice.dto;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.constants.Type;

public class FlightDTO {
	private FlightNames name;
	private Type type;
	private double price;
	private String flightId;
	private boolean service;

	/**
	 * 
	 */
	public FlightDTO() {

	}

	@Override
	public String toString() {
		return "FlightDTO [name=" + name + ", type=" + type + ", price=" + price + ", flightId=" + flightId
				+ ", service=" + service + "]";
	}

	/**
	 * @param name
	 * @param type
	 * @param price
	 * @param flightId
	 * @param service
	 */
	public FlightDTO(FlightNames name, Type type, double price, String flightId, boolean service) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.flightId = flightId;
		this.service = service;
	}

	/**
	 * @return the name
	 */
	public FlightNames getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(FlightNames name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the service
	 */
	public boolean isService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(boolean service) {
		this.service = service;
	}

}
