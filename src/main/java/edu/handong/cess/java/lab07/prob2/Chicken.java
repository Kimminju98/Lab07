package edu.handong.cess.java.lab07.prob2;

public class Chicken {
	
	private String name;
	private int price;
	private int stars;
	
	
	public Chicken(String name,int price, int stars) {
		this.name=name;
		this.price=price;
		this.stars=stars;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
}
