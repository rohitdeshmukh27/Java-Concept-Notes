
/*Design a Java program to manage course enrollment details using an ArrayList.
 *  Implement the following functionalities using built-in methods(such as add(),set(),size(),remove(), clear(),contains(),isEmpty()) and user input:
a.	Include course_id, course name, students enrolled, student_name, and student_id.
Use built-in methods to add this entry to the ArrayList.Display a success message after adding the entry.
*/

import java.util.*;


public class Management {
	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<Course>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
		System.out.println("\n1. Add Course"); 
		System.out.println("2. Enroll Student in a Course"); 
		System.out.println("3. Display Course Enrollment Details"); 
		System.out.println("4. Exit");
		System.out.print("Enter your choice: "); 
		int choice = scanner.nextInt();
		scanner.nextLine(); // Consume newline
			switch (choice) {
				case 1:
					System.out.println("enter course Name");
					String name = scanner.nextLine();
					System.out.println("enter course Id");
					String id = scanner.nextLine();
					Course c = new Course(name,id);
					break;
				case 2:
					System.out.println("enter course Id you want to enroll");
					String ID = scanner.nextLine();
					Course CurrentCourse=null;
					for (Course C : courses) {
						if(C.course_id==ID) {
							CurrentCourse=C;
						}
					}
					if(CurrentCourse!=null) {
						System.out.println("enter student Name");
						String StuName = scanner.nextLine();
						System.out.println("enter Student Id");
						String StuId = scanner.nextLine();
						CurrentCourse.add_Student(StuName,StuId);
					}
					break;
				case 3:
					break;
				case 4:
					System.exit(0);
					break;
			  }
	
		}
        }
}

