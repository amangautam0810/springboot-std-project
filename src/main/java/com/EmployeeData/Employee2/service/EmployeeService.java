package com.EmployeeData.Employee2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeData.Employee2.bean.Employee;
import com.EmployeeData.Employee2.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository EmployeeRepo;
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees= new ArrayList<>();
		EmployeeRepo.findAll().forEach(employees::add);
		return employees;
	}

	public Employee addEmployee(Employee employee) {
		EmployeeRepo.save(employee);
		return employee;
		
	}

	public String updateEmployee(Employee employee) {
		EmployeeRepo.save(employee);
		return "updated employee";
	}

	public void deleteEmployee(int id) {
		EmployeeRepo.deleteById(id);
		
	}


}
