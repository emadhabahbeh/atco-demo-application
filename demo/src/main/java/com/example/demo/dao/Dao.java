package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class Dao {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public Dao(EmployeeRepo employeeRepo) {

        this.employeeRepo = employeeRepo;
    }
    public Employee getById(long id){
        return employeeRepo.findById(id).orElse(null);
    }
         }
