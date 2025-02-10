package com.universitycoursemanagement;
// ResearchCourse class inherit the CourseType class
public class ResearchCourse extends CourseType {
    // Constructor
    public ResearchCourse(){
        super("Research based Course");
    }
    @Override
    public String getEvaluationMethod(){
        return "Evaluation via research projects";
    }
}