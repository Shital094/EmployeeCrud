package com.cjc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.model.Employee;
import com.cjc.crud.servicei.EmployeeServiceI;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceI esi;
 
 
 
 
 
 
 
 
 
 
 @GetMapping("/getAll")
 public List<Employee> getAll()
 {
	List<Employee> list= esi.getAllData();
	return list;
	 
 }
}
