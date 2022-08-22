package com.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.entity.PersonInfo;
import com.coding.service.PersonService;

@RestController("/person")
public class MainController {
	@Autowired
	PersonService service;
	@PostMapping("/update")
	ResponseEntity<String> upset(@RequestBody PersonInfo person) {
		return new ResponseEntity<String>(service.upset(person), HttpStatus.CREATED);
	}
	@GetMapping("/delete/{name}")
	ResponseEntity<String> deletePerson(@PathVariable String name) {
		return new ResponseEntity<String>(service.deletePerson(name), HttpStatus.OK);
	}
	@GetMapping("/findIndividual")
	ResponseEntity<PersonInfo> findIndividual(@RequestParam String name) {
		return new ResponseEntity<PersonInfo>(service.findIndividual(name),HttpStatus.OK);
	}
	@GetMapping("/findAll")
		ResponseEntity<List<PersonInfo>> allPersonInfo(){
		return new ResponseEntity<List<PersonInfo>>(service.allPersonInfo(),HttpStatus.OK);
	}
}
