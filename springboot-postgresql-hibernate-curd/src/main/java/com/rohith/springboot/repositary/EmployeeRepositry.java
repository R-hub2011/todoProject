package com.rohith.springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohith.springboot.model.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Long>
{

}
