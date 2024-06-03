package constructor;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private ArrayList<String> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void displayEnrollmentDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName); 
        System.out.println("Students Enrolled:");
        for (String student : enrolledStudents) {
            System.out.println(student);
        }
    }
    
    public void enrollStudent(String studentId, String studentName) { 
        enrolledStudents.add(studentId + " - " + studentName);
    }
    
    public String getCourseId() { 
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
