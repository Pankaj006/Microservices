package com.example.employeeservice.feignclient;


import com.example.employeeservice.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="address-service",url="http://localhost:8081/")  //we can also do like this
@FeignClient(name="ADDRESS-SERVICE") //also iike this which is the best way, u can also provide the context path like path="/addesss/id..."
//for load balancer initially ribbon was used but now its spring cloud load balancer @RibbonClient(name="address-service")
public interface AddressClient {

    @GetMapping("/getAddress")
    ResponseEntity<AddressDto> getEmployeeByAddress();

}
