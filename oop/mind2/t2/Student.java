package oop.mind2.t2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<LearningCourse> learningCourses;

    public Student(String name) {
        this.name = name;
        this.learningCourses = new ArrayList<>();
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public List<LearningCourse> getLearningCourses() {
        return learningCourses;
    }

    // --- Setters ---
    public void setName(String name) {
        this.name = name;
    }

    // Method to add a learning course to the student's list
    public void addCourse(LearningCourse course) {
        this.learningCourses.add(course);
    }

    @Override
    public String toString() {
        return "Student Name: " + name;
    }
}