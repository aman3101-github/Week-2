import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the program
public class SchoolSystem {

    public static void main(String[] args) {
        // Create a school
        School school = new School("Bright Future High School");

        // Create students
        Student student1 = new Student(1, "Aman");
        Student student2 = new Student(2, "Adarah");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);

        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Display school details
        school.displaySchoolDetails();

        // Display each student's enrolled courses
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display students enrolled in a specific course
        course2.displayEnrolledStudents();
    }
}

// School class
class School {
    private String schoolName;
    private List<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display school details along with student names
    public void displaySchoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students Enrolled:");
        for (Student student : students) {
            System.out.println(" - " + student.getStudentName());
        }
        System.out.println();
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private List<Course> courses;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Enroll the student in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Add the student to the course's list of students
        }
    }

    // Display the courses the student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println("Student: " + studentName + " (ID: " + studentId + ")");
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    // Getter for student name
    public String getStudentName() {
        return studentName;
    }
}

// Course class
class Course {
    private String courseName;
    private List<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add a student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display the students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getStudentName());
        }
        System.out.println();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}