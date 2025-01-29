import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the University Management System
public class UniversityManagementSystem {

    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor(1, "Dr. Harsh");
        Professor professor2 = new Professor(2, "Dr. RS Singh");

        // Create courses
        Course course1 = new Course(101, "Computer Science", professor1);
        Course course2 = new Course(102, "Mathematics", professor2);

        // Create students
        Student student1 = new Student(201, "Aman");
        Student student2 = new Student(202, "Adarsh");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private List<Course> enrolledCourses;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Add this student to the course
            System.out.println(studentName + " enrolled in " + course.getCourseName());
        }
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    // Getter method to fix private access issue
    public String getStudentName() {
        return studentName;
    }
}

// Professor class
class Professor {
    private int professorId;
    private String professorName;

    // Constructor
    public Professor(int professorId, String professorName) {
        this.professorId = professorId;
        this.professorName = professorName;
    }

    // Getter for professor name
    public String getProfessorName() {
        return professorName;
    }
}

// Course class
class Course {
    private int courseId;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    // Constructor
    public Course(int courseId, String courseName, Professor professor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    // Add a student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
        System.out.println("Professor: " + professor.getProfessorName());
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getStudentName()); // Fixed private access issue
        }
        System.out.println();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}
