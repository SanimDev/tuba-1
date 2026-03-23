package com.api.tubav1.controller;

import com.api.tubav1.dto.CourseDto;
import com.api.tubav1.dto.CourseResponse;
import com.api.tubav1.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    /**
     * GET /api/courses
     * GET /api/courses?category=finance
     */
    @GetMapping
    public CourseResponse getCourses(
            @RequestParam(required = false) String category) {

        List<CourseDto> courses;

        if (category == null || category.equalsIgnoreCase("all")) {
            courses = service.getAllCourses();
            return new CourseResponse(
                    "all",
                    courses.size(),
                    courses
            );
        }

        courses = service.getByCategory(category);

        return new CourseResponse(
                category,
                courses.size(),
                courses
        );
    }
}