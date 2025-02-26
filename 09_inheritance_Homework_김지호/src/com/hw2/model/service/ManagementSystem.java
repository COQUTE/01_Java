package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	void addPerson(Person person);
	
	void removePerson(String id);
	
	void displayAllPersons();
}
