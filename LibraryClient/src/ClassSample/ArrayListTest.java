package ClassSample;

import java.util.ArrayList;;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> myArray=new ArrayList<Integer>();		
		myArray.add(45);
		myArray.add(90);


		ArrayList<String> myStr=new ArrayList<String>();
		myStr.add("ameri");
		myStr.add("po")	;

		System.out.println(myArray);
		getArrayList(myStr);
		System.out.println("capital " + myStr);
		filterEven(myArray);
		System.out.println(myArray);
	}

	private static void filterEven(ArrayList<Integer> myArray) {

		for(int i=0;i<myArray.size();i++) {
			if(myArray.get(i) % 2 ==0 ) {
				myArray.remove(i);
			}
		}

	}

	/*	
	public static boolean isSorted(Comparable[] x, boolean y) {
	    boolean isAscending = true;
	    if (x.length == 0 || x.length == 1) return true;
	    else if (y) {
	        for (int i = 0; isAscending && i < x.length - 1; i++)
	            if (x[i].compareTo(x[i + 1]) > 0) isAscending = false; // descending 
	    } else {
	        for (int i = 0; isAscending && i < x.length - 1; i++)
	            if (x[i].compareTo(x[i + 1]) < 0) isAscending = false; // ascending 
	    }
	    return isAscending;
	}
	}
	*/
	
	private static void getArrayList(ArrayList<String> myStr) {


		for (int i=0;i<myStr.size();i++) {			
			String word = myStr.get(i); 
			if (word.endsWith("i")) { 
				//word.toUpperCase();
				myStr.remove(i);
				i--; 
			}						
		}			
	}

}
