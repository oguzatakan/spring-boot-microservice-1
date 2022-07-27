package com.atakanoguzdev.springbootmicroservice1.repository;

import com.atakanoguzdev.springbootmicroservice1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository <Course, Long> {
}
