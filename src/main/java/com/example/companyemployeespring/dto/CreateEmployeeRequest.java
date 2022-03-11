package com.example.companyemployeespring.dto;


import com.example.companyemployeespring.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private int salary;
    private String position;
    private List<Company> companies;
}
