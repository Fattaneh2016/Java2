package Recursions;

public class Factorial {
	public static void main(String[] args) {

		System.out.println(oddevenfact(7));
		makeStarBucks(3);
		System.out.println();
		makeStarBucks(5);
	}


	public static long oddevenfact (int x){


		if (x>2) return(oddevenfact(x-2) * (long) x);
		else
			return(x);
	}


	public static void makeStarBucks ( int n){

		if(n>0){

			System.out.print("*");

			makeStarBucks(n-1);
			System.out.print("$");	
		}


	}


	public static String makeStarBucks1 ( int n){


		if(n==0) 
			return "";
		
			else return "*" +  makeStarBucks1(n-1) + "$"; 

	}


}


