package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
//import com.cg.entity.Employee;
import com.cg.entity.Employees;
import com.cg.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//IOC will create object for this
@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepo employeeRepo;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employees> emps=employeeRepo.findAll();
        List<EmployeeDTO> list=new ArrayList<>();
        emps.forEach(e->list.add(EntityMapper.convertEntityToDto(e)));
        return list;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return EntityMapper.convertEntityToDto(employeeRepo.saveAndFlush(EntityMapper.convertObjectToEntity(employee)));
    }

    @Override
    public EmployeeDTO getEmployeeById(int id) {
        Optional<Employees> emp=employeeRepo.findById(id);
        if(emp.isPresent()){
            return EntityMapper.convertEntityToDto(emp.get());
        }else
            throw new EmployeeNotFoundException("EMPLOYEE NOT FOUND") ;
    }

    @Override
    public EmployeeDTO removeEmployee(int empid) {
        Optional<Employees> emp=employeeRepo.findById(empid);
        if(emp.isPresent()){
            employeeRepo.deleteById(empid);
            return EntityMapper.convertEntityToDto(emp.get());
        }else
            throw new EmployeeNotFoundException("EMPLOYEE NOT FOUND") ;
    }

    @Override
    public Employees  updateEmployee(Employees  employee) {
        if(getEmployeeById(employee.getEmpid())!=null){
            return employeeRepo.saveAndFlush(employee);
        }
        return null;
    }

    @Override
    public List<EmployeeDTO> getEmpByName(String name) {
        List<Employees> emp=employeeRepo.findByName(name);
        List<EmployeeDTO> list=new ArrayList<>();
        emp.forEach(e->list.add(EntityMapper.convertEntityToDto(e)));
        return list;
    }
}
