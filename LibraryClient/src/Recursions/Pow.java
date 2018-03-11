package Recursions;

public class Pow {
	public static void main(String[] args) {
		System.out.println(pow(2,4));

	}
	public static int pow(int x,int y) {

		if ( y<0) {
			throw new IllegalArgumentException("negative exponent" + y );
		}
		else if ( y==0) {
			return 1;
		}else if( y % 2==0) {
			return pow(x*x,y/2); //even and y>0 				
		}else {
			return x* pow(x,y-1); //odd and y>0
		}
		}

	}
