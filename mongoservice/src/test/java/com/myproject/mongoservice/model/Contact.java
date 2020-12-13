package com.myproject.mongoservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="contacts")
public class Contact {
@Id
private String number;
private int code;
private String name;
private String email;
private String location;

	
	}
