package com.example.demo.controller;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/TestDatabase")

    public Object getAllEmployee() throws Exception {
       return new EmployeeService().getEmployeeList();
    }

}







