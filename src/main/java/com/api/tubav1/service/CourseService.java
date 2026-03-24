package com.api.tubav1.service;



import com.api.tubav1.dto.CourseDto;
import java.util.List;

public interface CourseService {

    List<CourseDto> getAllCourses();

    List<CourseDto> getFeaturedCourses();

    List<CourseDto> getByCategory(String category);

    CourseDto createCourse(CourseDto dto);
}
