package com.cjc.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
