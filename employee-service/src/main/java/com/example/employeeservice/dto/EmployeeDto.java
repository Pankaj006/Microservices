package com.example.employeeservice.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {


     int id;
     String name;

     AddressDto addressDto;



}
