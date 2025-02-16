package com.annotation.excercise.customannotation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
public class TaskManagerTest {
    @Test
    void testAnnotationPresence() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");
        assertTrue(method.isAnnotationPresent(TaskInformation.class));
    }

    @Test
    void testAnnotationValues() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInformation taskInfo = method.getAnnotation(TaskInformation.class);

        assertEquals("High", taskInfo.priority());
        assertEquals("John Doe", taskInfo.assignedTo());
    }
}
