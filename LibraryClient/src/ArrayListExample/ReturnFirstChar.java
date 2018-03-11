package ArrayListExample;

import java.util.ArrayList;

public class ReturnFirstChar {
	
	public static void main(String[] arr) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Hello");
		list.add("World");
		
		String name1="a";
		String name2="c";
		String name3="e";
		String max;
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			str =str + str.charAt(i);
				
				System.out.println(str);
		}	
		
		if (name1.compareTo(name2)>0 && name1.compareTo(name3)>0){
			
			max = name1;

		}
		else if  (name2.compareTo(name1)>0 && name2.compareTo(name3)>0) {
			
			max=name2;
			
		}else {
				max=name3;
			}
		System.out.println(max);
		}
		
	
	}


