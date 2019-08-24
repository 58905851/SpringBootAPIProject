package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
