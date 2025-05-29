package oop.mind2.t2;
import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS() {
        this.students = new ArrayList<>();
    }

    public void printStudentData(Student student) {
        if (student == null) {
            System.out.println("Error: Student object is null. Cannot print data.");
            return;
        }

        System.out.println("\n#####STUDENT INFORMATION#####");
        System.out.println(student);

        if ("Zaali Injgia".equals(student.getName())) {
            addActualCoursesFromArgus(student);
        }

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
    private void addActualCoursesFromArgus(Student student) {

        student.addCourse(new LearningCourse(
                "Object Oriented Programming",
                "Introduction to Programming",
                "Java syntax and data structures"
        ));

        student.addCourse(new LearningCourse(
                "Computer Organization",
                "Introduction to Programming",
                "Representing and manipulating information;" +
                        "Machine-level representations of programs;" +
                        "Optimizing program Performance;" +
                        "The memory hierarchy"
        ));

        student.addCourse(new LearningCourse(
                "Mathematical Foundation of Computing",
                "Calculus I, CS50 Introduction to Programming",
                "Mathematical logic;" +
                        "Elements of Discrete Mathematics;" +
                        "Elements of Sets Theory" +
                        "Elements of Graph Theory" +
                        "Elements of Combinatorics;" +
                        "Elements of Digital Systems"
                
        ));

        student.addCourse(new LearningCourse(
                "Calculus II",
                "Calculus I",
                "Antiderivatives;" +
                        "Definite integrals; " +
                        "Techniques and applications of integration; " +
                        "Improper integrals;" +
                        "Infinite series"
        ));

        student.addCourse(new LearningCourse(
                "English Language Course C1-2",
                "English Language Course C1-1",
                "Globalization and Its Impact, Environmental Issues and Technology and Society."
        ));
    }
}
