package com.cjc.crud.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
import com.cjc.crud.model.Employee;
import com.cjc.crud.repository.EmployeeRepository;
import com.cjc.crud.servicei.EmployeeServiceI;
@Service
public class EmployeeServiceImp implements EmployeeServiceI{

	@Autowired
	EmployeeRepository er;

	@Override
<<<<<<< HEAD
	public void deleteData(Employee e) {
		// TODO Auto-generated method stub
		er.delete(e);
	}

	@Override
	public Iterable<Employee> getAllData() {
		// TODO Auto-generated method stub
		return er.findAll();
	}
=======
	public void postData(Employee e) {
		er.save(e);
	}
	
	@Override
	public List<Employee> getAllData() {
		
		return (List<Employee>) er.findAll();
	}

	

>>>>>>> branch 'main' of https://github.com/Shital094/EmployeeCrud.git
}
