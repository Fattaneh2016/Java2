/*Programmer : Fattaneh Ameri Mahabadian lab on Thursday 9:00 to 10:40 
 * CSC 1302 – Spring 2018 Homework #5
 * Q2:
 Write a recursive method called starString that accepts an integer as 
 a parameter and prints to the console a string of starts (asterisks)
 that is 2n (i.e. 2 to the nth power) long. For example:
 
 Output :
 
starString(0) should print * (because 20 == 1)
starString(2) should print **** (because 22 == 4)
starStrting(4) should print **************** (because 24 == 16)
 */

package Recursions;

public class RecursiveStar {

	public static void main(String[] args) {
		//starString(0);
		//starString(2);
		//printStars(4);
		//printStars1(5);
		//System.out.println();
		//printStars2(5);
		starString(0);
		System.out.println(" ( because  " + "2" + 0 + " == " + (int)Math.pow(2, 0) + ")" );
		starString(2);
		System.out.println(" ( because  " + "2" + 2 + " == " + (int) Math.pow(2, 2) + ")" );
		starString(4);
		System.out.println(" ( because  " + "2" + 4 + " == " + (int)Math.pow(2, 4) + ")" );
		
		
	}
	public static void starString(int n) {
		
		if (n == 0) {
		// base case;
			
		System.out.print("*");
		
		} else {			
		 starString(n-1);
		 starString(n-1);
		 
		}
		
	}
	public static void makeStar(int n) 
		
		{
			if(n!=0)
			{
			System.out.printf("*");
			makeStar(n-1);
			}
			else {
			System.out.println();
			} 
		 
}
	public static void printStars1(int n) 
		{
			if(n!=0)
			{
			
			printStars1(n-1);
			makeStar(n);
			}
		}
	public static void printStars2(int n) 
	{
		if(n!=0)
		{
			makeStar(n);
		printStars2(n-1);
		
		}
	}
	public static void printStars(int n) {
		if (n == 0) {
		// base case; just end the line of output
		System.out.println();
		} else {
		// recursive case; print one more star
		System.out.print("*");
		printStars(n -1);
		}
		}
}

//starString(0) should print * (because 20 == 1)
//starString(2) should print **** (because 22 == 4)
//starStrting(4) should print **************** (because 24 == 16)

