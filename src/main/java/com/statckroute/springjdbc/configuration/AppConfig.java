package com.statckroute.springjdbc.configuration;

import com.statckroute.springjdbc.CrudOperationsDemo;
import com.statckroute.springjdbc.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {


    @Bean
    public DriverManagerDataSource driverManagerDataSource()
    {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); //mysql driver
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/JDBCDEMO"); //db connection
        driverManagerDataSource.setUsername("harika"); // username
        driverManagerDataSource.setPassword("Root@123"); //password
        return driverManagerDataSource;
    }

    @Bean
    public Employee employee()
    {
        return new Employee();
    }

    @Bean
    public CrudOperationsDemo crudOperationsDemo()
    {
        return new CrudOperationsDemo();
    }
}
