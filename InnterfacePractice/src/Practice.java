/*Define two interfaces: CardioWorkout and StrengthTraining.
a.	 In the CardioWorkout interface, declare methods such as getWorkoutName(), getDurationMinutes(), and displayWorkoutDetails().
b.	In the StrengthTraining interface, declare methods like getEquipmentUsed(), getInstructorName(), and displayStrengthTrainingDetails().
*/
import java.util.*;

interface CardioWorkout{
	 String getWorkoutName();
	 int getDurationMinutes();
	 void displayWorkoutDetails();
}

interface StrenghtTraining{
	String getEquipmentUsed();
	String getInstructorName();
	String displayStrengthTrainingDetails();
}
public class Practice implements CardioWorkout,StrenghtTraining {
	String workout="plank";
	int duration =10;
	String Workout_details = " akjbfiabjf";
	String Equipment="Dumbbells ";
	String Instructor="Divyansh" ;
	public static void main(String[] arg) {
		
		
	}
	@Override
	public String getWorkoutName() {
		return workout;
	}
	@Override
	public String getEquipmentUsed() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getInstructorName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String displayStrengthTrainingDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDurationMinutes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void displayWorkoutDetails() {
		// TODO Auto-generated method stub
		
	}

}
