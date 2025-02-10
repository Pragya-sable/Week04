package com.universitycoursemanagement;
// Different type of courses are represented by abstract class
public abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getEvaluationMethod();
}
