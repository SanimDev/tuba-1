package com.api.tubav1.mapper;

import com.api.tubav1.dto.AuthorDto;
import com.api.tubav1.dto.CourseDto;
import com.api.tubav1.model.Course;

public class CourseMapper {

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

}