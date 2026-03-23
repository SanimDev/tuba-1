package com.api.tubav1.service.impl;


import com.api.tubav1.dto.CategoryDto;
import com.api.tubav1.mapper.CategoryMapper;
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
}