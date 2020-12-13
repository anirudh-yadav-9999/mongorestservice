package com.myproject.mongoservice.repository;

import com.myproject.mongoservice.model.Contact;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends MongoRepository<Contact, String> {

	Contact findByNumber(String number);

	Contact findByEmail(String email);

	List<Contact> findAllByLocation(String location);
}
//com.myproject.mongoservice.service
