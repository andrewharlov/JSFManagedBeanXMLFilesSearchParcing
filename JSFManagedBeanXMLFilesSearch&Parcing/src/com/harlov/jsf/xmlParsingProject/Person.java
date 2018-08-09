package com.harlov.jsf.xmlParsingProject;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Person {
	private String id;
	private String firstName;
	private String lastName;
	
	public Person(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}
