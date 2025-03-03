package com.cjc.crud.servicei;


import com.cjc.crud.model.Employee;import java.util.List;
import com.cjc.crud.model.Employee;

public interface EmployeeServiceI {
	void postData(Employee e);
List<Employee> getAllData();
Employee getDataById(int eid);
void deletedata(int eid);
void updateData(Employee emp);
List<Employee> getAllByUnameAndPassword(String uname, String pass);
List<Employee> getMinSalary(Employee emp);
List<Employee> getMaxSalary(Employee e);
Double getAverageSalary();


	

}
