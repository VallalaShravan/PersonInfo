package com.coding.require;

import java.util.List;

import com.coding.entity.*;

public interface Requirements {
	
	String upset(PersonInfo person);
	String deletePerson(String name);
	PersonInfo findIndividual(String name);
	List<PersonInfo> allPersonInfo();

}
