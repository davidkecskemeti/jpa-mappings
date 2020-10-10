package com.dk.jpa.mappings.composite.repository;

import com.dk.jpa.mappings.composite.entity.Employee;
import com.dk.jpa.mappings.composite.entity.EmployeeId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, EmployeeId> {

    List<Employee> findByEmployeeIdDepartmentId(Long departmentId);
}
