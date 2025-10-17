package org.itdma.springapi.api.controller;

import org.itdma.springapi.api.model.Courses;
import org.itdma.springapi.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CoursesController {
    private CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping("/courses")
    public Courses getCourses(@RequestParam int courseId) {
        Optional courses = coursesService.getCourses(courseId);
        if (courses.isPresent()) {
            return (Courses) courses.get();
        }
        return null;
    }

    @GetMapping("/courses/name")
    public Courses getNamedName(@RequestParam String courseName) {
        Optional courses = coursesService.getNamedName(courseName);
        if (courses.isPresent()) {
            return (Courses) courses.get();
        }
        return null;
    }
}
