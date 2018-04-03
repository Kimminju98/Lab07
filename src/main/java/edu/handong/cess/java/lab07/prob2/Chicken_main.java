package edu.handong.cess.java.lab07.prob2;

public class Chicken_main {

	public static void main(String []args) {
		
		Chicken m1 = new Chicken("Cheese_mustard",16000,3);
		Chicken m2 = new Chicken("Honey_mustard",16000,4);
		Chicken m3 = new Chicken("Spicey_chicken",15000,1);
		
		System.out.println("menu1 : "+m1.getName()+"'s rating is "+m1.getStars());
		System.out.println("menu1 : "+m2.getName()+"'s rating is "+m2.getStars());
		System.out.println("menu1 : "+m3.getName()+"'s rating is "+m3.getStars());
	}
	
	
}
