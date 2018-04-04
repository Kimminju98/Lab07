package edu.handong.cess.java.lab07.prob1;
import java.util.Scanner;

/**
 * This is YearToCentury class
 * <p> This program shows century
 *     Enter the year you want to know
 * 
 * This class have YearToCentury(),century(),main() methods.
 * @author MinJu
 *
 */

public class YearToCentury { 

	int year; // The year that user want to know 
	/**
	 * This is YearToCentury method.
	 * 
	 * @param year that you entered
	 */
	public YearToCentury(int year) { 
		// TODO Auto-generated constructor stub
		this.year =year; // this.year is class's member, year and year is parameter year.
	}
	/**
	 * 
	 * This is century method.
	 * This method give what century it is.
	 * @return century
	 */

	public int century() {
		
		if(year<100) { // case : year < 100
			return 0; // 0's century
		}
		
		else if((year%100)==0) {  // case : year % 100 ==0
			return (year/100); // year/100 's century
		}
		else { // case : year>100 && year%100!=0
			return ((year/100)+1); // year/100+1 's century
		} 
	}
	
	
	/**
	 * This is implement, main method.
	 * Enter the year
	 * and then this method show what century it is.
	 * 
	 * This method call YearToCentury class's century method.
	 * 
	 * @param args
	 */
	
	
	public static void main(String [] args) {
		
		int year;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input year :");
		year=keyboard.nextInt();
		
		YearToCentury mycentury = new YearToCentury(year);
		
		System.out.print(year+" is " +mycentury.century()+"th century");
		
	}
	
	
}
