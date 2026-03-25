package com.cg.service;

import com.cg.bean.Employee;
import com.cg.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo erpo;

    public List<Employee> getAllEmployees() {
        return erpo.findAll();
    }

}
