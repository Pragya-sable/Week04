package com.universitycoursemanagement;

public class Main {
    public static void main(String[] args) {
        // Create instances of different types of course types
        ExamCourse examCourse = new ExamCourse();
        AssignmentCourse assignmentCourse = new AssignmentCourse();
        ResearchCourse researchCourse = new ResearchCourse();


        // Create instances of Course with specific course types
        // The type parameter is set to the corresponding course type
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);

        // Create a CourseCatalog to store the courses
        CourseCatalog catalog = new CourseCatalog();
        // Add the created courses to the catalog
        catalog.addCourse(mathCourse);
        catalog.addCourse(csCourse);
        catalog.addCourse(aiCourse);
        // Display the details of all the courses in the catalog
        catalog.displayCourses();
    }
}
