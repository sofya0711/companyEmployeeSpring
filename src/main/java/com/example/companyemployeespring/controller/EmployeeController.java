package com.example.companyemployeespring.controller;

import com.example.companyemployeespring.dto.CreateEmployeeRequest;
import com.example.companyemployeespring.entity.Company;
import com.example.companyemployeespring.entity.Employee;
import com.example.companyemployeespring.service.CompanyService;
import com.example.companyemployeespring.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final CompanyService companyService;


    @GetMapping("/employees")
    public String employeePage(ModelMap map) {
        List<Employee> employees = employeeService.findAll();
        map.addAttribute("employees", employees);
        return "employees";
    }

    @GetMapping("/employees/byCompany/{id}")
    public String employeesByCompanyPage(ModelMap map, @PathVariable("id") int id) {
        Company company = companyService.findById(id);
        List<Employee> employees = employeeService.findAllByCompany(company);
        map.addAttribute("employees", employees);
        return "employees";
    }




}
