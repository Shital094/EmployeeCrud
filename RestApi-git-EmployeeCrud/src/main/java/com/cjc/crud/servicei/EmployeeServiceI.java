package com.cjc.crud.servicei;

<<<<<<< HEAD
import com.cjc.crud.model.Employee;

=======

import java.util.List;
import com.cjc.crud.model.Employee;
>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
public interface EmployeeServiceI {
	void postData(Employee e);
List<Employee> getAllData();
void deletedata(int eid);

	

	

	void deleteData(Employee e);

	Iterable<Employee> getAllData();

}
