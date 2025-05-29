package oop.mind2.t2;

public class Tester {
    public static void main(String[] args) {
        UMS universityManagementSystem = new UMS();


        LearningCourse oop = new LearningCourse(
                "Object Oriented Programming",
                "Introduction to Programming",
                "Java syntax and data structures;\n"
        );

        LearningCourse compOrganization = new LearningCourse(
                "Computer Organization",
                "Introduction to Programming",
                "Digital logic, processor architecture, memory hierarchy, " +
                        "instruction sets, and data representation in computer systems."
        );

        LearningCourse mofc = new LearningCourse(
                "Mathematical Foundation of Computing",
                "Calculus I, Introduction to Programming",
                "Set theory, logic, functions, relations, recursion, " +
                        "induction, and graph theory in the context of computing."
        );

        // Courses for other students
        LearningCourse calculus2 = new LearningCourse(
                "Calculus II",
                "Calculus I",
                "Limits, Derivatives of Functions, Applications of Derivatives," +
                        " Integrals, Fundamental Theorem of Calculus"
        );

        LearningCourse englishC2 = new LearningCourse(
                "English Language Course C1-2",
                "English Language Course C1-1",
                "Globalization and Its Impact, Environmental Issues and Technology and Society."
        );


        Student selfStudent = new Student("Zaali Injgia");
        selfStudent.addCourse(calculus2);
        selfStudent.addCourse(englishC2);
        selfStudent.addCourse(oop);
        selfStudent.addCourse(mofc);
        selfStudent.addCourse(compOrganization);
        universityManagementSystem.addStudent(selfStudent);

        Student alice = new Student("Alice Smith");
        universityManagementSystem.addStudent(alice);

        Student bob = new Student("Bob Johnson");
        universityManagementSystem.addStudent(bob);



        System.out.println("Displaying data for Zaali Injgia:");
        universityManagementSystem.printStudentData(selfStudent);
        System.out.println("Displaying data for Alice Smith:");
        universityManagementSystem.printStudentData(alice);

        System.out.println("Displaying data for Bob Johnson:");
        universityManagementSystem.printStudentData(bob);
    }
}