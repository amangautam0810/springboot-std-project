package com.EmployeeData.Employee2.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String cName;
	private String location;
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, int age, String cName, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.cName = cName;
		this.location = location;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
