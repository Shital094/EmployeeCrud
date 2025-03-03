package com.cjc.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
 @GetMapping("/getAll")
 public List<Employee> getAll()
 {
	List<Employee> list= esi.getAllData();
	return list;
	 
 }
 @DeleteMapping("deleteData/{eid}")
 public String deleteData(@PathVariable("eid") int eid)
 {
	 esi.deletedata(eid);
	return "delete successfully";
	 
 }
 
	
}
