package com.statckroute.springjdbc;

import com.statckroute.springjdbc.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = applicationContext.getBean("employee", Employee.class);

        employee.setId(501);

        employee.setName("Harsha");

        employee.setAge(22);

        employee.setGender("male");

        CrudOperationsDemo crudOperationsDemo = applicationContext.getBean("crudOperationsDemo", CrudOperationsDemo.class);

        //create employee
        crudOperationsDemo.addEmployee(employee);

        //select employee
        crudOperationsDemo.getEmployeeDetails();

        //update employee by id
        crudOperationsDemo.updateEmployee(501, new Employee(501,"Harsha",23,"male"));

        crudOperationsDemo.getEmployeeDetails();

        //delete employee by id
        crudOperationsDemo.deleteEmployee(501);
    }
}
