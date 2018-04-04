package edu.handong.cess.java.lab07.prob2;

/**
 * This is Chicken_main class.
 * This class has main() method.
 * <p> This class show chicken menu (name + rating)
 * 
 * @author MinJu
 *
 */

public class Chicken_main {

	/**
	 * This is implement main method.
	 * This method call Chicken class and Chicken class's getName method and getStars method
	 * and then print out m1, m2, m3 's chicken name and rating .
	 * 
 	 * @param args
	 */
	public static void main(String []args) {
		
		Chicken m1 = new Chicken("Cheese_mustard",16000,3); // initiated Chicken class by using m1 and give name,price,rating to Chicken constructor
		Chicken m2 = new Chicken("Honey_mustard",16000,4); // initiated Chicken class by using m2 and give name,price,rating to Chicken constructor
		Chicken m3 = new Chicken("Spicey_chicken",15000,1); // initiated Chicken class by using m3 and give name,price,rating to Chicken constructor
		
		System.out.println("menu1 : "+m1.getName()+"'s rating is "+m1.getStars()); // print-out m1's chicken name and Stars
		System.out.println("menu2 : "+m2.getName()+"'s rating is "+m2.getStars());// print-out m2's chicken name and Stars
		System.out.println("menu3 : "+m3.getName()+"'s rating is "+m3.getStars());// print-out m3's chicken name and Stars
	}
	
	
}
