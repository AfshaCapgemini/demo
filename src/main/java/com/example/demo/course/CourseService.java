package com.example.demo.course;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    List<Course> courses = new ArrayList<>();
    {
        courses.add(new Course("Maths","Afsha", "09:00", "10:00"));
        courses.add(new Course("Computer", "Nick", "11:00", "12:00"));
        courses.add(new Course("Science", "Hussein", "14:00", "15:00"));
        courses.add(new Course("Physics", "Junita", "16:00", "17:00"));
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCoursesByName(String name) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }


    public Course addCourse(Course newCourse) {
        courses.add(newCourse);
        return newCourse;
    }


    public void deleteCourseByName(String name) {
        courses.removeIf(course -> course.getName().equalsIgnoreCase(name));
    }

}
