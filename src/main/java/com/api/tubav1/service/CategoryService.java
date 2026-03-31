package com.api.tubav1.service;

import com.api.tubav1.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAll();

    public CategoryDto create(CategoryDto dto) ;

    CategoryDto update(Long id, CategoryDto dto);

}