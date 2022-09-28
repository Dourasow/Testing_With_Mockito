package com.testingPractice;

public class Student {

    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    private  StudentService studentService;

    public int calculateAverage(){

        int average = studentService.getTotalMarks()/studentService.getNumberOfStudents();
        return average;
    }
}
