package com.deguzman.Real.Estate.Tracker.API.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.deguzman.Real.Estate.Tracker.API.property_models.Property;

public interface PropertyDao {

	public List<Property> getAllPropertyInformation();
	
	public ResponseEntity<Property> getPropertyInformationById(long propertyId);
	
	public List<Property> getPropertyInfoByCity(String city);
	
	public List<Property> getPropertyInfoByState(String state);
	
	public List<Property> getPropertyInfoByRooms(double rooms);
	
	public List<Property> getPropertyInfoByBathrooms(double bathrooms);
	
	public int addPropertyInformation(Property propertyInfo);
	
	public int updatePropertyInformation(long propertyId, Property propertyInfo);
	
	public int deletePropertyInformation(long propertyId);
	
}
