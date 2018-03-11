/*Programmer : Fattaneh Ameri Mahabadian lab on Thursday 9:00 to 10:40 
 * CSC 1302 – Spring 2018 Homework #5
 * Q1:
/*Write a program that calls a recursive method called multiply
that takes two integer parameters a and b, where a and b are both
positive integers. You can only use the + or – for multiplication.*/

package Recursions;
public class Multiply {

	public static void main(String[] args) {
		System.out.println(multiply(6,5));

	}
	//using addition and subtraction instead of multiplication 
	
	public static int multiply(int num1,int num2) {
		if (num2 == 1) {
			return num1;
		} else if (num2 == 2) {
			return (num1 + num1);
		} else {
			return (multiply(num1, num2-1) + num1);
		}
	}
}

