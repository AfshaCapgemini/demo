package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/courses")
public class CourseController {

    @Autowired
   private CourseService service;

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @GetMapping(path = "/{name}")
    public Course getCoursesByName(@PathVariable String name) {
        return service.getCoursesByName(name);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course newCourse) {
        return service.addCourse(newCourse);
    }

    @DeleteMapping(path = "/{name}")
    public void deleteCourseByName(@PathVariable String name) {
        service.deleteCourseByName(name);
    }
}

