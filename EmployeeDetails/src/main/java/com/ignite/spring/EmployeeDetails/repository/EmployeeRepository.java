package com.ignite.spring.EmployeeDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ignite.spring.EmployeeDetails.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
