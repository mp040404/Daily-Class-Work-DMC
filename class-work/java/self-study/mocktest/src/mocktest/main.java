package mocktest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {


    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Registration> registrations = new ArrayList<>();

    // Add Student
    public static void addStudent(Student s) {
        students.add(s);
    }

    // Add Course
    public static void addCourse(Course c) {
        courses.add(c);
    }

    // Find Student by ID
    public static Student findStudent(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    // Find Course by ID
    public static Course findCourse(int id) {
        for (Course c : courses) {
            if (c.getCourseId() == id) {
                return c;
            }
        }
        return null;
    }

    // Register Student
    public static void registerStudent(int regId, int studentId, int courseId)
            throws RecordNotFoundException {

        Student s = findStudent(studentId);
        Course c = findCourse(courseId);

        if (s == null) {
            throw new RecordNotFoundException("Student not found!");
        }

        if (c == null) {
            throw new RecordNotFoundException("Course not found!");
        }

        registrations.add(new Registration(regId, studentId, courseId));
        System.out.println("Registration Successful!");
    }

    // Display Students
    public static void displayStudents() {
        System.out.println("\n--- Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Display Courses
    public static void displayCourses() {
        System.out.println("\n--- Courses ---");
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    // View Students by Course Name
    public static void viewStudentsByCourse(String courseName)
            throws RecordNotFoundException {

        boolean found = false;

        for (Course c : courses) {
            if (c.getTitle().equalsIgnoreCase(courseName)) {

                for (Registration r : registrations) {
                    if (r.getCourseId() == c.getCourseId()) {

                        Student s = findStudent(r.getStudentId());
                        System.out.println(s);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            throw new RecordNotFoundException("No students found!");
        }
    }

    // Main Method
    public static void main(String[] args) {

        try {
            addStudent(new Student(1, "Mohit", "mohit@gmail.com"));
            addStudent(new Student(2, "Rahul", "rahul@gmail.com"));

            addCourse(new Course(101, "Java", 100));
            addCourse(new Course(102, "DBMS", 100));

            registerStudent(1, 1, 101);
            registerStudent(2, 2, 101);

            displayStudents();
            displayCourses();

            System.out.println("\n--- Students in Java ---");
            viewStudentsByCourse("Java");

        } catch (RecordNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
