package com.api.tubav1.dto;

import lombok.Data;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private String description;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getTotalCourses() {
        return totalCourses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTotalCourses(Integer totalCourses) {
        this.totalCourses = totalCourses;
    }

    private String imageUrl;
    private Integer totalCourses;
}
