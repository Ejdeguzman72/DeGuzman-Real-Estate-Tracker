package com.deguzman.Real.Estate.Tracker.API.property_models;

import java.util.Date;

public class Acquisitions {

	private long acquisitionId; 
	private long propertyId;
	private Date acquisitionDate;
	private double amount;
	
	public long getAcquisitionId() {
		return acquisitionId;
	}
	public void setAcquisitionId(long acquisitionId) {
		this.acquisitionId = acquisitionId;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public Date getAcquisitionDate() {
		return acquisitionDate;
	}
	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acquisitionDate == null) ? 0 : acquisitionDate.hashCode());
		result = prime * result + (int) (acquisitionId ^ (acquisitionId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (propertyId ^ (propertyId >>> 32));
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
		Acquisitions other = (Acquisitions) obj;
		if (acquisitionDate == null) {
			if (other.acquisitionDate != null)
				return false;
		} else if (!acquisitionDate.equals(other.acquisitionDate))
			return false;
		if (acquisitionId != other.acquisitionId)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (propertyId != other.propertyId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Acquisitions [acquisitionId=" + acquisitionId + ", propertyId=" + propertyId + ", acquisitionDate="
				+ acquisitionDate + ", amount=" + amount + "]";
	}
	public Acquisitions(long acquisitionId, long propertyId, Date acquisitionDate, double amount) {
		super();
		this.acquisitionId = acquisitionId;
		this.propertyId = propertyId;
		this.acquisitionDate = acquisitionDate;
		this.amount = amount;
	}
	public Acquisitions() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
