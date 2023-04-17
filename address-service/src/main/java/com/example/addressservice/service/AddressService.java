package com.example.addressservice.service;


import com.example.addressservice.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {


    public AddressDto getAllEmployee() {
        return Optional.of(new AddressDto())
                .map(addressDto -> {
                    addressDto.setId(1);
                    addressDto.setAddress("Prague czech republic!");
                    return addressDto;
                })
                .orElse(null);
    }


}
