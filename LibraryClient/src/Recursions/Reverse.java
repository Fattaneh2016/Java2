package Recursions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (new File("reverseMe.txt"));
		Reverse( input);
	}
	public static void Reverse(Scanner input) {
		if(input.hasNextLine()) {			
			String line=input.nextLine();
			Reverse(input);
			System.out.println(line);
		}
	}

}
