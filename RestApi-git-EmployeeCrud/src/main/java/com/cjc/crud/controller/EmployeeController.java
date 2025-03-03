package com.cjc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.model.Employee;
import com.cjc.crud.servicei.EmployeeServiceI;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceI esi;
 
 @GetMapping("/delete")
	public String deleteData(@ModelAttribute Employee e,Model m)
	{
		esi.deleteData(e);
		
		Iterable<Employee> list=esi.getAllData();
		m.addAttribute("data", list);
		return "success";
		
	}
}
