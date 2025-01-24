public class Course {

    // Instance Variables 
    private String courseName;
	// Duration in hours or days
    private int duration;  
    private double fee;

    // Class Variable 
    private static String instituteName = " ABC Academy ";  

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display details of a specific course
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: Rs." + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("                            ");
    }

    // Class Method: Update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course("Java Programming", 100, 5000.00);
        Course course2 = new Course("Full Stack Development", 120, 4000.00);

        // Displaying course details before updating the institute name
        System.out.println("Course details before updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("Coding School");

        // Displaying course details after updating the institute name
        System.out.println("Course details after updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
