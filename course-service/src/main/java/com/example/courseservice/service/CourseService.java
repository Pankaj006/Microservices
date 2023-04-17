package com.example.courseservice.service;


import com.example.courseservice.dto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    public CourseDto getAllCourse(){
        return Optional.of(new CourseDto())
                .map(courseDto -> {
                    courseDto.setCourseId(130);
                    courseDto.setCourseName("java course");
                    return courseDto;
                }).orElse(null);
    }


}
