package edu.handong.cess.java.lab07.prob3;
import java.util.Random;
/**
 * This is Attendence_main class
 * It has main() method
 * It has absent member
 * <p> print out who is fail (if absent >6 , fail)
 * @author User
 *
 */
public class Attendence_main {

	/**
	 * This is implement, main method
	 * This method make 4 Attendance instance and give name,grade,id parameter (s1,s2,s3,s4)
	 * and then make random absent number by using Random class
	 * This method call setAbsent and give random absent number to setAbsent
	 * and call getAbsent Id and printout s1,2,3,4 name and fail or success message.
	 * @param args
	 */
	public static void main(String [] args) {
		
		Random randomGen = new Random(); // Initiate Random class, named randomGen for using Random class's method. 
		int absent; // absent count variable
		
		Attendance s1 = new Attendance("Jess",4,21400999); //Initiate Attendance class, named s1(student1)
		Attendance s2 = new Attendance("Kent",2,21700111); //Initiate Attendance class, named s2(student2)
		Attendance s3 = new Attendance("Lucas",1,21833222); //Initiate Attendance class, named s3(student3)
		Attendance s4 = new Attendance("Martha",4,21733444); //Initiate Attendance class, named s4(student4)
		
		absent = randomGen.nextInt(10); // put random number to absent (range : 0~10)
		s1.setAbsent(absent); // Give absent value to s1(Attendance class)'s setAbsent method
		
		absent = randomGen.nextInt(10);// put random number to absent (range : 0~10)
		s2.setAbsent(absent); // Give absent value to s2(Attendance class)'s setAbsent method
		
		absent = randomGen.nextInt(10);// put random number to absent (range : 0~10)
		s3.setAbsent(absent); // Give absent value to s3(Attendance class)'s setAbsent method
		
		absent = randomGen.nextInt(10);// put random number to absent (range : 0~10)
		s4.setAbsent(absent); // Give absent value to s4(Attendance class)'s setAbsent method
		
		if(s1.getAbsent() > 6) { // if s1(Attendance class)'s absent value > 6
			System.out.println("I'm sorry "+s1.getName()+" You fail this course"); // print-out s1's name and fail message
		}
		else System.out.println("We'll see about the grade, "+s1.getName()); // if s1(Attendance class)'s absent value < 6, print-out s1's name and message
		if(s2.getAbsent() > 6) {// if s2(Attendance class)'s absent value > 6
			System.out.println("I'm sorry "+s2.getName()+" You fail this course"); // print-out s2's name and fail message
		}
		else System.out.println("We'll see about the grade, "+s2.getName());// if s2(Attendance class)'s absent value < 6, print-out s2's name and message
		if(s3.getAbsent() > 6) { // if s3(Attendance class)'s absent value > 6
			System.out.println("I'm sorry "+s3.getName()+" You fail this course"); // print-out s3's name and fail message
		}
		else System.out.println("We'll see about the grade, "+s3.getName());// if s3(Attendance class)'s absent value < 6, print-out s3's name and message
		if(s4.getAbsent() > 6) { // if s4(Attendance class)'s absent value > 6
			System.out.println("I'm sorry "+s4.getName()+" You fail this course"); // print-out s4's name and fail message
		}
		else System.out.println("We'll see about the grade, "+s4.getName());// if s4(Attendance class)'s absent value < 6, print-out s4's name and message
		
	}
	
}
