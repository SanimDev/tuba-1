package com.api.tubav1.repository;

import com.api.tubav1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // Optional: Find category by name
    Optional<Category> findByName(String name);

    // Optional: Check if category exists
    boolean existsByName(String name);

}