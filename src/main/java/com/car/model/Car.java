package com.car.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Car {

	@Id
	private int carNo;
	private String dateOfBooking;
	private String fromLocation;
	private String toLocation;
	private String bookedName;
	private int phoneNo;
	
	public Car() {
		super();
	}

	public Car(int carNo, String dateOfBooking, String fromLocation, String toLocation, String bookedName,
			int phoneNo) {
		super();
		this.carNo = carNo;
		this.dateOfBooking = dateOfBooking;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.bookedName = bookedName;
		this.phoneNo = phoneNo;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getBookedName() {
		return bookedName;
	}

	public void setBookedName(String bookedName) {
		this.bookedName = bookedName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", dateOfBooking=" + dateOfBooking + ", fromLocation=" + fromLocation
				+ ", toLocation=" + toLocation + ", bookedName=" + bookedName + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
	
}
