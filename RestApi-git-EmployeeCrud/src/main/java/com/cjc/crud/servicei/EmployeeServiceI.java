package com.cjc.crud.servicei;


import java.util.List;
import com.cjc.crud.model.Employee;
public interface EmployeeServiceI {
	void postData(Employee e);
List<Employee> getAllData();
void deletedata(int eid);

	

	

}
