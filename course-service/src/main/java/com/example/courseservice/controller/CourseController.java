package com.example.courseservice.controller;


import com.example.courseservice.dto.CourseDto;
import com.example.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @Autowired
    private CourseService courseService;

    @GetMapping("/getAllCourse")
    public ResponseEntity<CourseDto> getAllCourse(){

        return  ResponseEntity.status(HttpStatus.OK).body(courseService.getAllCourse());
    }


}
