package com.myproject.mongoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myproject.mongoservice.model.Contact;
import com.myproject.mongoservice.repository.ContactsRepository;
import com.myproject.mongoservice.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactsRepository contactRepository;
	
	@Override
	public List<Contact> findAll(){
		
		return contactRepository.findAll();
	}
	
	@Override
	public List<Contact> findAllByLocation(String location){
		
		return contactRepository.findAllByLocation(location);
		}
	@Override
	public Contact findByNumber (String number) {
		return contactRepository.findByNumber(number);
		
	}
	@Override
	public Contact findByEmail(String email) {
		
		return contactRepository.findByEmail(email);
	}
	
	@Override
	public void saveOrUpdateContact(Contact contact) {
		
		contactRepository.save(contact);
	}
	@Override
	public  void deleteContactByNumber(String number) {
		contactRepository.deleteById(number);
		
	}
	
	

}
