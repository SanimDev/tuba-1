package com.api.tubav1.repository;

import com.api.tubav1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByFeaturedTrue();

    List<Course> findByCategoryCode(String categoryCode);
}