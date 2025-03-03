package com.cjc.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
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

 

 @PutMapping("/updateData")
 public String updateData(@RequestBody Employee emp)
 {
	 esi.updateData(emp);
	return "update successfully";
	 
 }
 @GetMapping("/getLoginCheck/{uname}/{password}")
 
 public List<Employee> getByUnamePass(@PathVariable("uname") String uname,@PathVariable("password") String pass) 
 {
	 if(uname.equals("admin")&&pass.equals("admin"))
	 {
		List<Employee> list=esi.getAllData(); 
		return list;
	 }else
	 {
		 List<Employee> l= esi.getAllByUnameAndPassword(uname,pass);
		 return l ;
	 }
}
 @GetMapping("/getminSalary")
public List<Employee> getMinSalary(@RequestBody Employee emp)
{
	 List<Employee> list=esi.getMinSalary(emp);
	return list;
	
}
 
 @GetMapping("/getDataById/{eid}")
 public Employee getDataById(@PathVariable("eid") int eid) {
     return esi.getDataById(eid);
 }


}
