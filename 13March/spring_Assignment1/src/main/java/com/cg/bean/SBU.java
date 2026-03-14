package com.cg.bean;

import java.util.ArrayList;
import java.util.List;

public class SBU {
    private String sbuId;
    private String sbuName;
    private String sbuHead;
    private List<Employee> employees;

    public SBU(){}
    public SBU(String sbuId, String sbuName, String sbuHead) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
//        this.employees = employees;
    }

    public String getSbuId() {
        return sbuId;
    }

    public void setSbuId(String sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {

        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "SBU: " +
                "sbuId='" + sbuId + '\'' +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' ;
    }

    public void sbuDetails() {
        System.out.println("SBU Details");
        System.out.println("------------------------");
        System.out.println("SBU ID: " + getSbuId());
        System.out.println("SBU Name: " + getSbuName());
        System.out.println("SBU Head: " + getSbuHead());
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println(getEmployees().toString());
    }
}
