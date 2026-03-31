package com.api.tubav1.service.impl;


import com.api.tubav1.dto.CategoryDto;
import com.api.tubav1.mapper.CategoryMapper;
import com.api.tubav1.model.Category;
import com.api.tubav1.repository.CategoryRepository;
import com.api.tubav1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository repository;

    // Manual constructor for Spring DI
    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CategoryDto> getAll() {
        return repository.findAll()
                .stream()
                .map(CategoryMapper::toDto)
                .toList();
    }

    @Override
    public CategoryDto create(CategoryDto dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        category.setImageUrl(dto.getImageUrl());
        category.setTotalCourses(dto.getTotalCourses());

        Category saved = repository.save(category);

        CategoryDto result = new CategoryDto();
        result.setId(saved.getId());
        result.setName(saved.getName());
        result.setDescription(saved.getDescription());
        result.setImageUrl(saved.getImageUrl());
        result.setTotalCourses(saved.getTotalCourses());

        return result;
    }

    @Override
    public CategoryDto update(Long id, CategoryDto dto) {

        Category category = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));

        // update fields
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        category.setImageUrl(dto.getImageUrl());
        category.setTotalCourses(dto.getTotalCourses());

        // if you have code field
        // category.setCode(dto.getCode());

        Category updated = repository.save(category);

        return CategoryMapper.toDto(updated);
    }

}