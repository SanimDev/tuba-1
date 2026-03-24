package com.api.tubav1.service.impl;

import com.api.tubav1.dto.AuthorDto;
import com.api.tubav1.dto.CourseDto;
import com.api.tubav1.mapper.CourseMapper;
import com.api.tubav1.model.Course;
import com.api.tubav1.repository.CourseRepository;
import com.api.tubav1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service   // important!
public class CourseServiceImpl implements CourseService {



    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(CourseServiceImpl::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CourseDto> getFeaturedCourses() {
        return List.of();
    }

    @Override
    public List<CourseDto> getByCategory(String category) {
        return courseRepository.findByCategoryCode(category)
                .stream()
                .map(CourseServiceImpl::toDto)
                .collect(Collectors.toList());
    }

    public static CourseDto toDto(Course c) {
        CourseDto dto = new CourseDto();
        dto.setId(c.getId());
        dto.setTitle(c.getTitle());
        dto.setDescription(c.getDescription());
        dto.setPrice(c.getPrice());
        dto.setStudents(c.getStudents());
        dto.setCategoryCode(c.getCategoryCode());
        dto.setCourseImage(c.getCourseImage());

        AuthorDto author = new AuthorDto();
        author.setName(c.getAuthorName());
        author.setRole(c.getAuthorRole());
        author.setImage(c.getAuthorImage());

        dto.setAuthor(author);
        return dto;
    }

    @Override
    public CourseDto createCourse(CourseDto dto) {

        Course course = new Course();

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setPrice(dto.getPrice());
        course.setStudents(dto.getStudents());
        course.setCategoryCode(dto.getCategoryCode());
        course.setCourseImage(dto.getCourseImage());

        // Author fields
        if (dto.getAuthor() != null) {
            course.setAuthorName(dto.getAuthor().getName());
            course.setAuthorRole(dto.getAuthor().getRole());
            course.setAuthorImage(dto.getAuthor().getImage());
        }

        // Save to DB
        Course saved = courseRepository.save(course);

        return toDto(saved);
    }
}