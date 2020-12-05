package com.project.springboot.controller;

import com.project.springboot.bean.Employee;
import com.project.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        Employee emp = service.getEmp(id);
        return emp;
    }


    @GetMapping("/emp")
    public Employee updateEmployee(Employee employee){
        Employee emp = service.updateEmp(employee);

        return emp;
    }

    @GetMapping("delemp")
    public String deleteEmp(Integer id){
        service.deleteEmp(id);
        return "success";
    }
}
