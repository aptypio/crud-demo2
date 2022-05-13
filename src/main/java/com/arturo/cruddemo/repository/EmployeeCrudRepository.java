package com.arturo.cruddemo.repository;

import com.arturo.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrudRepository extends JpaRepository<Employee, Long> {

}
