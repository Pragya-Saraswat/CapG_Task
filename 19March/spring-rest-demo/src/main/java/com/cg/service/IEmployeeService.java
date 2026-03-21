package com.cg.service;

import com.cg.dto.EmployeeDTO;
//import com.cg.entity.Employee;
import com.cg.entity.Employees;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeDTO> getAllEmployees();
    public EmployeeDTO createEmployee(EmployeeDTO employee);
    public EmployeeDTO getEmployeeById(int id);
    public EmployeeDTO removeEmployee(int empid);
    public Employees updateEmployee(Employees employee);
    public List<EmployeeDTO> getEmpByName(String name);
}
