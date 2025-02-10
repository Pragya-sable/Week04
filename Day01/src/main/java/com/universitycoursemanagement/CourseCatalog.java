package com.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog {
    // List to store courses
    // It uses a wildcard to handle any subclass of CourseType
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    // Method to add a course to the catalog. It accepts any course that extends CourseType
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // Method to retrieve all the courses in the catalog
    public List<Course<? extends CourseType>> getCourses() {
        return courses;
    }


    // Method to display all the courses in the catalog
    public void displayCourses() {
        System.out.println("University Course Catalog:");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}