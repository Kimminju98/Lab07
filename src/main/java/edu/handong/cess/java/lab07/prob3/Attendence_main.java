package edu.handong.cess.java.lab07.prob3;
import java.util.Random;

public class Attendence_main {

	public static void main(String [] args) {
		
		Random randomGen = new Random();
		int absent;
		
		Attendance s1 = new Attendance("Jess",4,21400999);
		Attendance s2 = new Attendance("Kent",2,21700111);
		Attendance s3 = new Attendance("Lucas",1,21833222);
		Attendance s4 = new Attendance("Martha",4,21733444);
		
		absent = randomGen.nextInt(10);
		s1.setAbsent(absent);
		
		absent = randomGen.nextInt(10);
		s2.setAbsent(absent);
		
		absent = randomGen.nextInt(10);
		s3.setAbsent(absent);
		
		absent = randomGen.nextInt(10);
		s4.setAbsent(absent);
		
		if(s1.getAbsent() > 6) {
			System.out.println("I'm sorry "+s1.getName()+" You fail this course");
		}
		else System.out.println("We'll see about the grade, "+s1.getName());
		if(s2.getAbsent() > 6) {
			System.out.println("I'm sorry "+s2.getName()+" You fail this course");
		}
		else System.out.println("We'll see about the grade, "+s2.getName());
		if(s3.getAbsent() > 6) {
			System.out.println("I'm sorry "+s3.getName()+" You fail this course");
		}
		else System.out.println("We'll see about the grade, "+s3.getName());
		if(s4.getAbsent() > 6) {
			System.out.println("I'm sorry "+s4.getName()+" You fail this course");
		}
		else System.out.println("We'll see about the grade, "+s4.getName());
		
	}
	
}
