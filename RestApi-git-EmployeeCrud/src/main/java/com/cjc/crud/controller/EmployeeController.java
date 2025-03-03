package com.cjc.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
import com.cjc.crud.model.Employee;
import com.cjc.crud.servicei.EmployeeServiceI;
@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceI esi;
 
<<<<<<< HEAD
 @GetMapping("/delete")
	public String deleteData(@ModelAttribute Employee e,Model m)
	{
		esi.deleteData(e);
		
		Iterable<Employee> list=esi.getAllData();
		m.addAttribute("data", list);
		return "success";
		
	}
=======

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
 
>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
}
