package org.example;


import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees =  communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employeeById = communication.getEmployee(2);
//        System.out.println(employeeById);

//        Employee employee = new Employee("Fedor", "Ivanov", "IT", 800);
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(8);
    }
}
