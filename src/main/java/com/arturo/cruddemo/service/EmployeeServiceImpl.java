package com.arturo.cruddemo.service;

import com.arturo.cruddemo.entity.Employee;
import com.arturo.cruddemo.repository.EmployeeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{

    @Autowired
    private EmployeeCrudRepository crudRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = crudRepository.save(employee);
        return savedEmployee;
    }
}
