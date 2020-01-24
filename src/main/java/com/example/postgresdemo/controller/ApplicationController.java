package com.example.postgresdemo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.dao.EmployeeDAOImpl;
import com.example.postgresdemo.model.Employee;

@RestController
@RequestMapping("/employeeApp")
public class ApplicationController {

	@Resource
	EmployeeDAOImpl employeeDao;

	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeDao.getAll();
	}

	@PostMapping(value = "/createEmp")
	public HttpStatus createEmployee(@RequestBody Employee emp) {
		employeeDao.createEmployee(emp);
		return HttpStatus.OK;
	}

	@PutMapping(value = "/updateEmp")
	public HttpStatus updateEmployee(@RequestBody Employee emp) {
		employeeDao.updateEmployee(emp);
		return HttpStatus.OK;
	}

	@PutMapping(value = "/executeUpdateEmp")
	public HttpStatus executeUpdateEmployee(@RequestBody Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		return HttpStatus.OK;
	}

	@DeleteMapping(value = "/deleteEmpById")
	public HttpStatus deleteEmployee(@RequestBody Employee emp) {
		employeeDao.deleteEmployee(emp);
		return HttpStatus.OK;
	}
}
