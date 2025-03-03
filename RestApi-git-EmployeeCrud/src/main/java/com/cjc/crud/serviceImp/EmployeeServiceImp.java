package com.cjc.crud.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.crud.model.Employee;
import com.cjc.crud.repository.EmployeeRepository;
import com.cjc.crud.servicei.EmployeeServiceI;
@Service
public class EmployeeServiceImp implements EmployeeServiceI{

	@Autowired
	EmployeeRepository er;
	public void postData(Employee e) {
		er.save(e);
	}
	
	@Override
	public List<Employee> getAllData() {
		
		return (List<Employee>) er.findAll();
	}

	@Override
	public void deletedata(int eid) {
		
		er.deleteById(eid);
	}
	@Override
	public void updateData(Employee emp)
	{
		er.save(emp);
	}

	

}
