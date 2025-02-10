package com.universitycoursemanagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CourseCatalogTest {
    // Declaring instance variables for CourseCatalog and the course types
    private CourseCatalog catalog;
    private ExamCourse examCourse;
    private AssignmentCourse assignmentCourse;
    private ResearchCourse researchCourse;

    // This method is executed before each test to initialize necessary objects
    @BeforeEach
    void setUp() {
        catalog = new CourseCatalog();
        examCourse = new ExamCourse();
        assignmentCourse = new AssignmentCourse();
        researchCourse = new ResearchCourse();
    }
    // Test case for adding courses to the catalog and retrieving them
    @Test
    void testAddAndRetrieveCourses() {
        // Create course instances with specific course types
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);

        // Add courses to the catalog
        catalog.addCourse(mathCourse);
        catalog.addCourse(csCourse);
        catalog.addCourse(aiCourse);

        // Retrieve the list of courses from the catalog
        List<Course<? extends CourseType>> courses = catalog.getCourses();
        assertEquals(3, courses.size());

        // Verify each course's name and type
        assertEquals("Mathematics 101", courses.get(0).getCourseName());
        assertEquals("Exam based Course", courses.get(0).getCourseType().getCourseName());

        assertEquals("Data Structures", courses.get(1).getCourseName());
        assertEquals("Assignment based Course", courses.get(1).getCourseType().getCourseName());

        assertEquals("Artificial Intelligence Research", courses.get(2).getCourseName());
        assertEquals("Research based Course", courses.get(2).getCourseType().getCourseName());
    }

    // Test case for checking the evaluation methods of each course type
    @Test
    void testEvaluationMethods() {
        assertEquals("Evaluation via final exams", examCourse.getEvaluationMethod());
        assertEquals("Evaluation via Assignment", assignmentCourse.getEvaluationMethod());
        assertEquals("Evaluation via research projects", researchCourse.getEvaluationMethod());
    }

    // Test case for verifying the toString() method in the Course class
    @Test
    void testCourseToString() {
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        assertEquals("Mathematics 101 (Exam based Course) - Evaluation via final exams", mathCourse.toString());

        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        assertEquals("Data Structures (Assignment based Course) - Evaluation via Assignment", csCourse.toString());

        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);
        assertEquals("Artificial Intelligence Research (Research based Course) - Evaluation via research projects", aiCourse.toString());
    }
}