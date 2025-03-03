package com.cjc.crud.servicei;

import com.cjc.crud.model.Employee;

public interface EmployeeServiceI {

	void deleteData(Employee e);

	Iterable<Employee> getAllData();

}
