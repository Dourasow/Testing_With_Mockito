package com.testingPractice;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    StudentService studentService = Mockito.mock(StudentService.class) ;

    Student student = new Student(studentService);

    @Test
    void calculateAverage() {
        Mockito.when(studentService.getTotalMarks()).thenReturn(3000);
        Mockito.when(studentService.getNumberOfStudents()).thenReturn(10);
        assertEquals(300, student.calculateAverage());
    }
}