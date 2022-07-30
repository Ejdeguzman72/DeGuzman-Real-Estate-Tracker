package com.deguzman.Real.Estate.Tracker.API.property_models;

public class Rentals {

	private long rentalId;
	private long propertyId;
	private double annuity;
	private int occupancy;
	
	public long getRentalId() {
		return rentalId;
	}
	public void setRentalId(long rentalId) {
		this.rentalId = rentalId;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public double getAnnuity() {
		return annuity;
	}
	public void setAnnuity(double annuity) {
		this.annuity = annuity;
	}
	public int getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annuity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + occupancy;
		result = prime * result + (int) (propertyId ^ (propertyId >>> 32));
		result = prime * result + (int) (rentalId ^ (rentalId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rentals other = (Rentals) obj;
		if (Double.doubleToLongBits(annuity) != Double.doubleToLongBits(other.annuity))
			return false;
		if (occupancy != other.occupancy)
			return false;
		if (propertyId != other.propertyId)
			return false;
		if (rentalId != other.rentalId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rentals [rentalId=" + rentalId + ", propertyId=" + propertyId + ", annuity=" + annuity + ", occupancy="
				+ occupancy + "]";
	}
	public Rentals(long rentalId, long propertyId, double annuity, int occupancy) {
		super();
		this.rentalId = rentalId;
		this.propertyId = propertyId;
		this.annuity = annuity;
		this.occupancy = occupancy;
	}
	public Rentals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
