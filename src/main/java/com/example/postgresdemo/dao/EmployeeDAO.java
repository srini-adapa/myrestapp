package com.example.postgresdemo.dao;

import java.util.List;

import com.example.postgresdemo.model.Employee;

public interface EmployeeDAO {

	List<Employee> getAll();
	void createEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void executeUpdateEmployee(Employee emp);
}
