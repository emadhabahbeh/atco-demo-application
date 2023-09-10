package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectToDataBaseConfiguration {
    @Bean
    public Connection getConnection() {
        Connection myConnection = null;
        try {
            String dbURL = "jdbc:oracle:thin:@194.163.169.38:1521:ebs_tstpdb";
            String strUserID = "system";
            String strPassword = "maneger";
            myConnection = DriverManager.getConnection(dbURL, strUserID, strPassword);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return myConnection;
    }

}

