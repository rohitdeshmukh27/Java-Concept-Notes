import java.util.ArrayList;

public class Course {
	String Course_name;
	String course_id;
	ArrayList<String> Student_enrolled;
	
	public Course(String course , String id ) {
		this.Course_name=course;
		this.course_id=id;
		this.Student_enrolled = new ArrayList();
	}
	
	public void add_Student(String name , String stuId) {
		Student_enrolled.add(name + "-" + stuId);
	}
	
	public String getCourseId() { 
		return course_id;
	}


	public String getCourseName() { 
		return Course_name;
	}
	 

	public ArrayList<String> getEnrolledStudents() { 
		return Student_enrolled;
	}

}
