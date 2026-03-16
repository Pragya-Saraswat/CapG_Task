package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

// this below annotation is scanning only its own package and if we move the file from that package that it will show an exception
//so therefore it is scanning com.cg

@SpringBootApplication
//@ComponentScan("com")
// so if we want to change the default behavior of the @SpringBootApplication then also we can use @ComponentScan("com") but it is not recommended
@PropertySource("classpath:data.properties")

public class FirstSpringBootAppApplication {

    public static void main(String[] args) {
//        below line is initializing the IOC container
//        .run() returns ApplicationContext
        ApplicationContext ctx=SpringApplication.run(FirstSpringBootAppApplication.class, args);

//        HelloWorld h= ctx.getBean(HelloWorld.class);
//        System.out.println(h.sayHello("World"));

        Employee e=(Employee)ctx.getBean(Employee.class);
        e.printEmployeeDetails();
    }

}
