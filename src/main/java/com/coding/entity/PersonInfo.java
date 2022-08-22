package com.coding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "person_info")
public class PersonInfo {
	@Id
	private String name;
	@Column
	private String email;
	@Column
	private int age;
	@Column(name = "CONTACT_NUMBER")
	private long contactNumber;
}
