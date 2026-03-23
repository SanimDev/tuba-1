package com.api.tubav1.dto;
import lombok.Data;


import java.util.List;

@Data
public class CourseResponse {

    private String category;
    private int total;
    private List<CourseDto> courses;

    public CourseResponse(String category, int total, List<CourseDto> courses) {
        this.category = category;
        this.total = total;
        this.courses = courses;
    }
}

