package com.deguzman.Real.Estate.Tracker.API.property_models;

import java.util.Arrays;

public class Property {

	private long propertyId;
	private String address01;
	private String address02;
	private String city;
	private String state; 
	private String zip;
	private String url;
	private double sqFt;
	private int rooms;
	private int bathrooms;
	private boolean petsAllowed;
	private String[] amenities;
	
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public String getAddress01() {
		return address01;
	}
	public void setAddress01(String address01) {
		this.address01 = address01;
	}
	public String getAddress02() {
		return address02;
	}
	public void setAddress02(String address02) {
		this.address02 = address02;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getSqFt() {
		return sqFt;
	}
	public void setSqFt(double sqFt) {
		this.sqFt = sqFt;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public boolean isPetsAllowed() {
		return petsAllowed;
	}
	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}
	public String[] getAmenities() {
		return amenities;
	}
	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address01 == null) ? 0 : address01.hashCode());
		result = prime * result + ((address02 == null) ? 0 : address02.hashCode());
		result = prime * result + Arrays.hashCode(amenities);
		result = prime * result + bathrooms;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + (petsAllowed ? 1231 : 1237);
		result = prime * result + (int) (propertyId ^ (propertyId >>> 32));
		result = prime * result + rooms;
		long temp;
		temp = Double.doubleToLongBits(sqFt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		Property other = (Property) obj;
		if (address01 == null) {
			if (other.address01 != null)
				return false;
		} else if (!address01.equals(other.address01))
			return false;
		if (address02 == null) {
			if (other.address02 != null)
				return false;
		} else if (!address02.equals(other.address02))
			return false;
		if (!Arrays.equals(amenities, other.amenities))
			return false;
		if (bathrooms != other.bathrooms)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (petsAllowed != other.petsAllowed)
			return false;
		if (propertyId != other.propertyId)
			return false;
		if (rooms != other.rooms)
			return false;
		if (Double.doubleToLongBits(sqFt) != Double.doubleToLongBits(other.sqFt))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", address01=" + address01 + ", address02=" + address02
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", url=" + url + ", sqFt=" + sqFt
				+ ", rooms=" + rooms + ", bathrooms=" + bathrooms + ", petsAllowed=" + petsAllowed + ", amenities="
				+ Arrays.toString(amenities) + "]";
	}
	public Property(long propertyId, String address01, String address02, String city, String state, String zip,
			String url, double sqFt, int rooms, int bathrooms, boolean petsAllowed, String[] amenities) {
		super();
		this.propertyId = propertyId;
		this.address01 = address01;
		this.address02 = address02;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.url = url;
		this.sqFt = sqFt;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.petsAllowed = petsAllowed;
		this.amenities = amenities;
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
