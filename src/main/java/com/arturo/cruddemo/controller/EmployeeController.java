package com.arturo.cruddemo.controller;

import com.arturo.cruddemo.entity.Employee;
import com.arturo.cruddemo.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class EmployeeController {

    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
    }
}
