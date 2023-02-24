package com.EmployeeData.Employee2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeData.Employee2.bean.Employee;
import com.EmployeeData.Employee2.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService EmpService;
	
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return EmpService.getAllEmployees();
		
	}
	
	@RequestMapping(method= RequestMethod.POST , value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		
		EmpService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/updateEmployee/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
		EmpService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void deleteEmployee(@PathVariable int id){
		EmpService.deleteEmployee(id);
	}

}
