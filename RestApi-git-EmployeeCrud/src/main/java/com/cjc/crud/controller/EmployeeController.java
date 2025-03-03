package com.cjc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.model.Employee;
import com.cjc.crud.servicei.EmployeeServiceI;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceI esi;
 
 @PostMapping("/postdata")
 public String postdata(@RequestBody Employee e) {
	 esi.postData(e);
	return"Data Inserted Successfully..";
 }
}
