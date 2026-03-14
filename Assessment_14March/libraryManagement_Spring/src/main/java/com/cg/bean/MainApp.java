package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Librarian librarian = (Librarian) context.getBean("l");
        librarian.issueBook();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
