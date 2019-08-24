package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
		
	}
	public Employee getEmployeeById(Integer employee_id) {
		// TODO Auto-generated method stub
		return employeeDao.findOne(employee_id);
	}
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	public void createEmployee(Integer employee_id) {
		// TODO Auto-generated method stub
		employeeDao.delete(employee_id);
		
	}

}
