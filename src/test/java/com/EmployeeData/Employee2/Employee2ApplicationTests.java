package com.EmployeeData.Employee2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.EmployeeData.Employee2.bean.Employee;
import com.EmployeeData.Employee2.repository.EmployeeRepository;
import com.EmployeeData.Employee2.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringBootTest
class Employee2ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	private EmployeeService EmpService;
	
	@MockBean
	private EmployeeRepository EmployeeRepo;
	
	@Test
	public void getEmployeeTest() {
		when(EmployeeRepo.findAll()).thenReturn(Stream.of(new Employee(12,"Ritu",24,"tcs","noida")).collect(Collectors.toList()));
		assertEquals(1,EmpService.getAllEmployees().size());
	}
	
	
	@Test
	public void addEmployeeTest() {
		Employee employee = new Employee(12,"Ritu",24,"tcs","noida");
		when(EmployeeRepo.save(employee)).thenReturn(employee);
		assertEquals(employee,EmpService.addEmployee(employee));
		
	}

	@Test
	public void deleteEmployeeTest() {
		int n=223;
		EmpService.deleteEmployee(n);
		verify(EmployeeRepo,times(1)).deleteById(n);
		
	}
	@Test
	public void updateEmployeeTest() {
		Employee employee = new Employee(12,"Ritu",24,"tcs","noida");
		when(EmployeeRepo.save(employee)).thenReturn(employee);
		assertEquals("updated employee",EmpService.updateEmployee(employee));
	}
	
}

