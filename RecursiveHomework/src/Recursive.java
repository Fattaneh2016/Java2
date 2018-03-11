/*Programmer : Fattaneh Ameri Mahabadian lab on Thursday 9:00 to 10:40 
 * CSC 1302 – Spring 2018 Homework #5
 * */
public class Recursive {

	public static void main(String[] args) {
		//multiply method using recursive
		System.out.println("***Multiply***");
		System.out.println(multiply(6,5));

		System.out.println();

		System.out.println("***starString***");
		System.out.println();
		//starString method using recursive
		starString(0);
		System.out.println(" ( because  " + "2" + 0 + " == " + (int)Math.pow(2, 0) + ")" );
		starString(2);
		System.out.println(" ( because  " + "2" + 2 + " == " + (int) Math.pow(2, 2) + ")" );
		starString(4);
		System.out.println(" ( because  " + "2" + 4 + " == " + (int)Math.pow(2, 4) + ")" );
	}
	//using addition instead of multiplication 
	public static int multiply(int num1,int num2) {

		if (num2 == 1) {
			return num1;
		} else if (num2 == 2) {
			return (num1 + num1);
		} else {
			return (multiply(num1, num2-1) + num1);
		}
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

}


