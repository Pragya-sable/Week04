package com.universitycoursemanagement;
// AssignmentCourse class inherit the CourseType class
public class AssignmentCourse extends CourseType {
    // Constructor
    public AssignmentCourse(){
        super("Assignment based Course");
    }
    public String getEvaluationMethod(){
        return "Evaluation via Assignment";
    }
}