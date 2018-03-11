package ClassSample;

import java.util.ArrayList;

public class ReverseArrayList{
	public static void main(String[] args){
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(5);
		intList.add(24);
		intList.add(1);
		intList.add(2);
		
		System.out.println(intList);
		reverse(intList);
		System.out.println(intList);
	}
	
	public static void reverse(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			int temp=list.remove(list.size()-1);
			list.add(i,temp);
		}
	}
}


