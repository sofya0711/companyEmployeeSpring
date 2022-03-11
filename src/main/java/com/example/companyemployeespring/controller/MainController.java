package com.example.companyemployeespring.controller;

import com.example.companyemployeespring.service.CompanyService;
import com.example.companyemployeespring.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

private final CompanyService companyService;
private final EmployeeService employeeService;

    @GetMapping("/")
    public String main(ModelMap map) {

        return "main";
    }

}
