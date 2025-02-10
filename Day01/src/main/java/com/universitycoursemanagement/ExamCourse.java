package com.universitycoursemanagement;
// ExamCourse class inherit the CourseType class
public class ExamCourse extends CourseType {
    // Constructor
    public ExamCourse(){
        super("Exam based Course");
    }
    public String getEvaluationMethod(){
        return "Evaluation via final exams";
    }
}
