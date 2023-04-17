package com.example.employeeservice.controller;


import com.example.employeeservice.dto.EmployeeDto;
import com.example.employeeservice.service.EmployeeService;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/getEmployee")
    public ResponseEntity<EmployeeDto> getEmployeeService() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
    }

    //in order to involke address service we can use resttemplates or webclient. but it is not adviced to use rest templates
    // because is it is synchronised thread and it blocks . Instead use webclient which is asyn .
    // it is better to use feign client provided by spring cloud

    @GetMapping("/getEmployeeAddress")
    public ResponseEntity<EmployeeDto> getEmployeeAddress() {

        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeWithAddress());
    }


}
