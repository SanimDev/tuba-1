package com.api.tubav1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courses")
@Getter @Setter
public class Course {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStudents(Integer students) {
        this.students = students;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorRole(String authorRole) {
        this.authorRole = authorRole;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStudents() {
        return students;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorRole() {
        return authorRole;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public Boolean getFeatured() {
        return featured;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Double price;
    private Integer students;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "course_image")
    private String courseImage;

    private String authorName;
    private String authorRole;
    private String authorImage;

    private Boolean featured;
}

