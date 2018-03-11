import java.util.ArrayList;

public class RemoveZeroes {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		
		numberList.add(0);
		numberList.add(4);
		numberList.add(5);
		numberList.add(0);		
		numberList.add(6);
		numberList.add(0);
		numberList.add(1);
		removeZeroes(numberList);	
	}
	public static void removeZeroes(ArrayList<Integer> zeroList) {
		for(int i=0;i<zeroList.size();i++) {
			int number=zeroList.get(i);
			if(number==0) {
				zeroList.remove(i);	
				i--;
			}			
		}
		System.out.println(zeroList);
	}
}
