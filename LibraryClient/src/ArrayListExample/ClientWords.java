package ArrayListExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientWords {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input=new Scanner(new File("words.txt"));
		while (input.hasNext()) {
			String word = input.next();
			allWords.add(word);
		}
		System.out.println(allWords);
		removePlural(allWords);
		System.out.println(allWords);
		createList();


	}	

	private static void createList() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for ( int i=1 ;i<=10 ;i++) {
			newList.add(10*i);
		}
		System.out.println(newList);
		for(int i=0;i<newList.size();i++) {
			newList.remove(i);
		}
		System.out.println(newList);
		int size=newList.size();
		for(int i=0;i<size;i++) {
			newList.add(i,90);
		}
		System.out.println(newList);
		//add stars
		for(int i=0;i<=newList.size();i=+2) {
			newList.add(i,777);

		}
		System.out.println(newList);
		//remove star 
		//for(int i=0;i<=newList.size();i++) {
		//	newList.remove(i);

		//}
		//	System.out.println(newList);

	}
	public static void removePlural(ArrayList<String> list) {
		for (int i=0 ;i<list.size();i++) {
			String str=list.get(i);
			if (str.endsWith("s")){
				list.remove(i);
				i--;
			}
		}
	}
}


