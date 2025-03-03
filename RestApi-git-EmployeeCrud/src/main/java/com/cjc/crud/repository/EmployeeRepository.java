package com.cjc.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	List<Employee> findAllByUnameAndPassword(String uname, String pass);
@Query("FROM Employee e WHERE e.salary = (SELECT MIN(e2.salary) FROM Employee e2)")
	List<Employee> getMin(Employee emp);
@Query("FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2)")
List<Employee> getMxn(Employee e);
@Query("SELECT AVG(e.salary) FROM Employee e")
Double findAverageSalary();

}
