package oop.mind2.t2;
import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void printStudentData(Student student) {
        if (student == null) {
            System.out.println("Error: Student object is null. Cannot print data.");
            return;
        }
        System.out.println("\n#####STUDENT INFORMATION#####");
        System.out.println(student);

        System.out.println("\nLearning Courses for " + student.getName() + ":");
        List<LearningCourse> courses = student.getLearningCourses();

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println("Course " + (i + 1) + ":");
                System.out.println(courses.get(i));
                if (i < courses.size() - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n" + "=".repeat(40));
    }
}