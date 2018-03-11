package Recursions;

public class RecursionWriteStars {

	public static void main(String[] args) {
		
		writeStars(9);
	}
	public static void writeStars(int n) {
		if(n==0) {
			System.out.println();
		}else {
			System.out.println("*");
			writeStars(n-1);
		}
	}

}
