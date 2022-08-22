package com.coding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.entity.PersonInfo;
import com.coding.repository.PersonRepository;
import com.coding.require.Requirements;
@Service
public class PersonService implements Requirements{
	@Autowired
	PersonRepository repo;
	
	@Override
	public String upset(PersonInfo person) {
	PersonInfo save = repo.save(person);
	if(save.getAge() == person.getAge()) {
		return "SUCCESS";
	}
		return "FAILED";
	}

	@Override
	public String deletePerson(String name) {
		repo.deleteById(name);
		return "DELETED";
	}

	@Override
	public PersonInfo findIndividual(String name) {
		Optional<PersonInfo> findById = repo.findById(name);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<PersonInfo> allPersonInfo() {
		return repo.findAll();
	}

}
