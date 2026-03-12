package com;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class EmployeeMain {
    /**
     *
     */
    private static final Logger LOGGER = Logger.getLogger("EmployeeMain");
    /**
     *
     * @param args
     */

     public static void main(String[] args) {
        final Employee emp=new Employee();
        emp.setEmpid(101);
        emp.setName("Pragya");
        emp.setEmail("pragya4@gmail.com");
        if(LOGGER.isLoggable(Level.INFO)){
            LOGGER.fine("Name : "+emp.getName()+"\nEmail : "+emp.getEmail());
        }


    }


}
