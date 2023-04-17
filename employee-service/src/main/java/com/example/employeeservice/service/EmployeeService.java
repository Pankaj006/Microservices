package com.example.employeeservice.service;


import com.example.employeeservice.dto.AddressDto;
import com.example.employeeservice.dto.EmployeeDto;
import com.example.employeeservice.feignclient.AddressClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private AddressClient addressClient;

    public EmployeeDto getAllEmployee() {
        return Optional.of(new EmployeeDto())
                .map(employeeDto -> {
                    employeeDto.setId(1);
                    employeeDto.setName("pankaj");
                    return employeeDto;
                }).orElse(null);
    }

    public EmployeeDto getEmployeeWithAddress(){

        return Optional.of(new EmployeeDto())
                .map(employeeDto -> {
                    employeeDto.setId(1);
                    employeeDto.setName("Pankaj");
                    AddressDto addressDto=addressClient.getEmployeeByAddress().getBody();
                    employeeDto.setAddressDto(addressDto);
                    return employeeDto;

                }).orElse(null);
    }


}
