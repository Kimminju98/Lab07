package edu.handong.cess.java.lab07.prob3;

public class Attendance {
	
	private String name;
	private int grade;
	private int id;
	private int absent;
	

	public Attendance(String name,int grade,int id) {
		this.name=name;
		this.grade=grade;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAbsent() {
		return absent;
	}


	public void setAbsent(int absent) {
		this.absent = absent;
	}
}
