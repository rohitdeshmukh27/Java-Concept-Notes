package constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Soham {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        
        while(true) {
            System.out.println("Menu for the user:-");
            System.out.println("1: Add course ");
            System.out.println("2: Enroll student");
            System.out.println("3: Course enrollment details");
            System.out.println("4: Exit");
            int choice = obj.nextInt();
            obj.nextLine(); // Consume the newline character
            
            switch(choice) {
                case 1:
                    System.out.println("Please enter your course ID:");
                    String CID = obj.nextLine();
                    System.out.println("Please enter your course Name:");
                    String CName = obj.nextLine();
                    Course course = new Course(CID, CName);
                    courses.add(course);
                    System.out.println("Course added successfully");
                    break;
                case 2:
                    System.out.println("Enter the course ID you want to enroll for:");
                    String Cid = obj.nextLine();
                    Course currentCourse = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(Cid)) {
                            currentCourse = c;
                            break;
                        }
                    }
                    if (currentCourse != null) {
                        System.out.println("Enter student's name:");
                        String name = obj.nextLine();
                        System.out.println("Enter student's ID:");
                        String studentId = obj.nextLine();
                        currentCourse.enrollStudent(studentId, name);
                        System.out.println("Successfully added the student to the course");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 3:
                    System.out.println("The courses you can enroll are:");
                    for (Course c : courses) {
                        String cID = c.getCourseId();
                        String name = c.getCourseName();
                        System.out.println("CourseID: " + cID + " Course Name: " + name);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
