package com.cjc.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	List<Employee> findAllByUnameAndPassword(String uname, String pass);

}
