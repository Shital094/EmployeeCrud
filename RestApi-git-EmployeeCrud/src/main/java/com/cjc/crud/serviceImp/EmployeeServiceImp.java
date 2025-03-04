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
	    public Employee getDataById(int eid) {
	        return er.findById(eid).orElse(null); // Returns null if employee is not found
	    }

	@Override
	public void updateData(Employee emp)
	{
		er.save(emp);
	}

	@Override
	public List<Employee> getAllByUnameAndPassword(String uname, String pass) {
		
		return er.findAllByUnameAndPassword(uname,pass);
	}

	@Override
	public List<Employee> getMinSalary(Employee emp) {
		
		return er.getMin(emp);
	}

	@Override
	public List<Employee> getMaxSalary(Employee e) {
	
		return er.getMxn(e);
	}

	 @Override
	    public Double getAverageSalary() {
	        return er.findAverageSalary();
	    }


	

}
