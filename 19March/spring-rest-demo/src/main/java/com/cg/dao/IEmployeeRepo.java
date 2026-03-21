package com.cg.dao;

import com.cg.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepo extends JpaRepository<Employees,Integer> {
    public List<Employees> findByName(String name);

}
