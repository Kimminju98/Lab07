package edu.handong.cess.java.lab07.prob2;
/**
 * This is Chicken class
 * This class has Chicken(),getName(),setName(),getPrice(),setPrice(),getStars(),setStars()method.
 * This class has name,price,stars members
 * 
 * @author User
 *
 */
public class Chicken {
	
	private String name; //This is Chicken class's member, name
	private int price;//This is Chicken class's member, price
	private int stars;//This is Chicken class's member, stars
	
	/**
	 * This is Chicken class, constructor
	 * This method put parameter to private variable.
	 * @param name
	 * @param price
	 * @param stars
	 */
	public Chicken(String name,int price, int stars) {
		this.name=name; // Put parameter name to private name
		this.price=price; // Put parameter price to private price
		this.stars=stars; // Put parameter stars to private stars
	}
	/**
	 * This is getName method.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; // Put parameter name to private name
	}
	/**
	 * This is getPrice method.
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price; // Put parameter price to private price
	}
	/**
	 * This is getStars method.
	 * @return stars
	 */
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars; // Put parameter stars to private stars
	}
	
}
