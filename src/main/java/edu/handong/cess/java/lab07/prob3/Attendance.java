package edu.handong.cess.java.lab07.prob3;
/**
 * This is Attendance class
 * This class has Attendance(), getName(),setName(), getGrade(),setGrade(), getId(),setId(), getAbsent(),setAbsent() methods.
 * This class has name,grade,id,absent members
 * @author MinJu
 *
 */
public class Attendance {
	
	private String name; // This is Attendance class's member, name
	private int grade; // This is Attendance class's member, grade
	private int id; // This is Attendance class's member, id
	private int absent; // This is Attendance class's member, absent
	
	/**
	 * This is Attendance method, constructor
	 * This method put parameter to private variable.
	 * 
	 * @param name
	 * @param grade
	 * @param id
	 */

	public Attendance(String name,int grade,int id) {
		this.name=name; // put parameter name to private name
		this.grade=grade; // put parameter grade to private grade
		this.id = id; // put parameter id to private id
	}
 
	/**
	 * This is getName method.
	 * @return name (private)
	 */

	public String getName() {
		return name; 
	}


	public void setName(String name) {
		this.name = name; // Put parameter name to private name
	}
	/**
	 * This is getGrade method.
	 * @return grade (private)
	 */


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade; // Put parameter grade to private grade
	}
	/**
	 * This is getId method.
	 * @return id (private)
	 */


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id; // put parameter id to private id
	}

	/**
	 * This is getAbsent method.
	 * @return absent (private)
	 */

	public int getAbsent() {
		return absent;
	}

	/**
	 * This is setAbsent method.
	 * This method put parameter absent to private absent
	 * @param absent integer
	 */

	public void setAbsent(int absent) {
		this.absent = absent; // put parameter absent to private absent
	}
}
