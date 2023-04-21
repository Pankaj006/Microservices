package com.example.addressservice.controller;


import com.example.addressservice.dto.AddressDto;
import com.example.addressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddress")
    public ResponseEntity<AddressDto> getAddress(){
        //return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
        System.out.println("calling");
        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAllEmployee());

    }

    @GetMapping("/getAddressdemo")
    public ResponseEntity<String> demo(){
        //return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);

        return ResponseEntity.status(HttpStatus.OK).body("something");

    }


    @GetMapping("/getAddressdemo1")
    public ResponseEntity<String> demo1(){
        //return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);

        return ResponseEntity.status(HttpStatus.OK).body("second push");

    }

    @GetMapping("/getAddressdemo1")
    public ResponseEntity<String> demo2(){
        //return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);

        return ResponseEntity.status(HttpStatus.OK).body("Third push");

    }

}
