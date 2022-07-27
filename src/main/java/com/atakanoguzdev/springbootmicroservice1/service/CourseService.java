package com.atakanoguzdev.springbootmicroservice1.service;

import com.atakanoguzdev.springbootmicroservice1.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
