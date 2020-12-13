package com.myproject.mongoservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.mongoservice.model.Contact;

@Service
public interface ContactService {
	

	Contact findByNumber(String number);
	Contact findByEmail(String email);
	List<Contact> findAllByLocation(String location);
	List<Contact> findAll();
	void saveOrUpdateContact(Contact contact);
	void  deleteContactByNumber(String number);
}
