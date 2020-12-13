package com.myproject.mongoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.mongoservice.model.Contact;
import com.myproject.mongoservice.service.ContactService;

@RestController
//@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	
	private ContactService contactService;
	
	@GetMapping (value = "/showRecords" )
	public List<Contact> getAllContacts(){
		return contactService.findAll();
	}
	@RequestMapping ("/testOutput" )
	public String testOutput(){
		return "Entered Controller";
	}

	

	@GetMapping(value ="/byNumber/{Number}")
	public Contact getContactByNumber(@PathVariable("Number") String Number) {
		
		return contactService.findByNumber(Number);
		
	}
	
	@GetMapping(value = "/byEmail/{Email}")
	public Contact getContactByEmail(@PathVariable("Email") String Email) {
		
		return contactService.findByEmail(Email);
	}
	
	@GetMapping(value = "/byLocation/{Location}")
	public List<Contact> getAllByLocation(@PathVariable("Location") String Location) {
		
		return contactService.findAllByLocation(Location);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> saveOrUpdateContact (@RequestBody Contact contact){
		
		System.out.println("Controller hit");
		
		contactService.saveOrUpdateContact(contact);
		return new ResponseEntity<>("Contact added successfully", HttpStatus.OK);
	}
	
	 @DeleteMapping(value = "/delete/{Number}")
	    public void deleteContact(@PathVariable String Number) {
	        contactService.deleteContactByNumber(Number);
	    }
	
}
