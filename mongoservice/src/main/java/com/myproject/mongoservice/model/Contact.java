package com.myproject.mongoservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="contacts")//name of the collection in the db for the model
public class Contact {
@Id
private String number;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
private int code;
private String name;
private String email;
private String location;

	
	}
