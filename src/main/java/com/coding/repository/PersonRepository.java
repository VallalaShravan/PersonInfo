package com.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.entity.PersonInfo;

public interface PersonRepository extends JpaRepository<PersonInfo, String>{

}
