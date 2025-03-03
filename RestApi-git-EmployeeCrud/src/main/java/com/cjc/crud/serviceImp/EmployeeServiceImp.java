package com.cjc.crud.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.model.Employee;
import com.cjc.crud.repository.EmployeeRepository;
import com.cjc.crud.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImp implements EmployeeServiceI{

	@Autowired
	EmployeeRepository er;

	@Override
	public void deleteData(Employee e) {
		// TODO Auto-generated method stub
		er.delete(e);
	}

	@Override
	public Iterable<Employee> getAllData() {
		// TODO Auto-generated method stub
		return er.findAll();
	}
}
