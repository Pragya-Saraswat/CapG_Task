package com.cg.dto;

import com.cg.entity.Employees;

public class EntityMapper {

    public static Employees convertObjectToEntity(EmployeeDTO edto){
        return new Employees(edto.getFullName(),edto.getDateOfBirth(), edto.getSalary());
    }
    public static EmployeeDTO convertEntityToDto(Employees emp){
        return new EmployeeDTO(emp.getEmpid(),emp.getName(),emp.getDob(),emp.getSalary());
    }
}
