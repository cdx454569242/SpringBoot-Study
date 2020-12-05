package com.project.springboot.service;

import com.project.springboot.bean.Employee;
import com.project.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "emp")
    public Employee getEmp(Integer id){
        System.out.println("查询 " + id + " 的员工");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }

    @CachePut
    public Employee updateEmp(Employee employee){
        System.out.println("updateEmp: " + employee);
        employeeMapper.updateEmp(employee);
        return employee;
    }

    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(Integer id){
        System.out.println("deleteEmp: " + id);
//        employeeMapper.deleteEmpById(id);
    }
}
