package com;

/**
 * @author pragya
 */
public class Employee {
    /**
     *
     */
    private int  empid ;
    /**
     *
     */
    private String name ;
    /**
     *
     */
    private String email ;

    /**
     *
     */
    public Employee() {
        this.empid = 0;
        this.name = "";
        this.email = "";
    }



    public int getEmpid() {
        return empid;
    }

    public void setEmpid(final int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
