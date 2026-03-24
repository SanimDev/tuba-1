package com.api.tubav1.controller;

import com.api.tubav1.dto.CategoryDto;
import com.api.tubav1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoryController {

    private final CategoryService service;

    // Manual constructor (Spring will use it)
    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoryDto> getCategories() {
        return service.getAll();
    }

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto dto) {
        return service.create(dto);
    }
}