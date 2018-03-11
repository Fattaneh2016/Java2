package Recursions;

import java.io.File;
import java.util.Scanner;

public class DirectoryCrawler {

	public static void main(String[] args) {
		Scanner console =new Scanner (System.in);
		System.out.print("Directory or filename" );
		String name=console.nextLine();
		File f=new File(name);
		if(!f.exists()) {
			System.out.println( f + "no such file /Directory exists");

		}else {
			crawl(f,"-");
		}
	}


	private static void crawl(File f, String indent) {
		System.out.println(indent + f.getName());
		if (f.isDirectory()) {
			// recursive case; print contained files/dirs
			for (File subFile : f.listFiles()) {
				crawl(subFile, indent + " ");
			}

		}
	}
}
