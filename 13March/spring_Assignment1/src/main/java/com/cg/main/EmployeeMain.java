package com.cg.main;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

//        =============Task 1 and Task 2=============
//        Employee employee=(Employee)context.getBean("e");
//        employee.empDetail();

//        =============Task 3=============
//        SBU sbu=(SBU)context.getBean("sbu");
//        sbu.sbuDetails();

//        =============Task 4=============
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");
        int id = sc.nextInt();

        Employee e = null;

        if(id == 100) {
            e = (Employee) context.getBean("e1");
        }
        else if(id == 101) {
            e = (Employee) context.getBean("e2");
        }

        System.out.println("Employee Info:");
        System.out.println("Employee ID : " + e.getEmpid());
        System.out.println("Employee NAME : " + e.getName());
        System.out.println("Employee SALARY : " + e.getSalary());
        ((ClassPathXmlApplicationContext)context).close();
    }
}
