package com.cg.controller;

import com.cg.dto.EmployeeDTO;
//import com.cg.entity.Employee;
import com.cg.entity.Employees;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(produces = {"application/json","application/xml"})
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{empid}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int empid){
        EmployeeDTO e=employeeService.getEmployeeById(empid);
        if(e!=null){
            return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
        }else{
            return new ResponseEntity("Employee not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<EmployeeDTO> getEmployeesByName(@PathVariable String name){
        return employeeService.getEmpByName(name);
    }

    @PostMapping(consumes = {"application/json","application/xml"})
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO e){
        return employeeService.createEmployee(e);
    }

    @DeleteMapping("/id/{id}")
    public EmployeeDTO deleteEmployee(@PathVariable int id){
        return employeeService.removeEmployee(id);
    }

    @PutMapping
    public Employees updateEmployee(@RequestBody Employees e){
        return employeeService.updateEmployee(e);
    }

}
