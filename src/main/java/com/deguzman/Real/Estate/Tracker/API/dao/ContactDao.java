package com.deguzman.Real.Estate.Tracker.API.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.deguzman.Real.Estate.Tracker.API.contact_models.Contact;

public interface ContactDao {

	public List<Contact> findAllContacts();
	
	public List<Contact> findContactByType(@PathVariable long contactTypeId);
	
	public List<Contact> findContactByLastname(@PathVariable String lastname);
	
	public ResponseEntity<Contact> findContactById(@PathVariable long contactId);
	
	public ResponseEntity<Contact> findContactByEmail(@PathVariable String email);
	
	public ResponseEntity<Contact> findContactByPhone(@PathVariable String phone);
	
	public int addContactInformation(@RequestBody Contact contact);
	
	public int updateContactInformation(@PathVariable long contactId);
	
	public long deleteAllContacts();
	
	public long deleteContactById(@PathVariable long contactId);
	
}
