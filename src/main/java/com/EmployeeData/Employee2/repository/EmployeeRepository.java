package com.EmployeeData.Employee2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EmployeeData.Employee2.bean.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

}
