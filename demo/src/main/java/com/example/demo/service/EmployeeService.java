package com.example.demo.service;

import com.example.demo.configuration.ConnectToDataBaseConfiguration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

   private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() throws SQLException {
        ConnectToDataBaseConfiguration connectToDataBaseConfiguration = new ConnectToDataBaseConfiguration();
        Statement sqlStatement = connectToDataBaseConfiguration.getConnection().createStatement();
        String readRecordSQL = "select * from xx_employee e";
        ResultSet myResultSet = sqlStatement.executeQuery(readRecordSQL);
        while (myResultSet.next()) {
                Employee employee = new Employee();
                employee.setId(myResultSet.getLong("id"));
                employee.setName(myResultSet.getString("name"));
                employeeList.add(employee);
        }
        return employeeList;
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private class Employee {

        @Id
        private long id;
        private String name;
    }
}
