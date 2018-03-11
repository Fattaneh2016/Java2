package ClassSample;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStars(3);
		int mine= mystery(348);
		System.out.println(mine);
		
		System.out.println(pow(3,4));
	}
	//Returns base ^ exponent.
	// Precondition: exponent >= 0
	public static int pow(int base, int exponent) {
		if (exponent == 0) {
			// base case; any number to 0th power is 1
			return 1;
		} else {
			// recursive case: x^y = x * x^(y-1)
			return base * pow(base, exponent -1);
		}
	}
	private static void printStars(int num) {
		// TODO Auto-generated method stub
		if( num==0) {
			System.out.println("*");
		}else {
			System.out.println("*");
			printStars(num-1);
		}
	}

	public static int mystery(int n) {
		if (n < 10) {
			return (10 * n) + n;
		} else {
			int a = mystery(n / 10);
			int b = mystery(n % 10);
			return (100 * a) + b;
		} 
	}

}
