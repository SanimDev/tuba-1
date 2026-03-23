package com.api.tubav1.mapper;

import com.api.tubav1.dto.CategoryDto;
import com.api.tubav1.model.Category;

public class CategoryMapper {

    public static CategoryDto toDto(Category c) {
        CategoryDto dto = new CategoryDto();
        dto.setId(c.getId());
        dto.setName(c.getName());
        dto.setDescription(c.getDescription());
        dto.setImageUrl(c.getImageUrl());
        dto.setTotalCourses(c.getTotalCourses());
        return dto;
    }
}
