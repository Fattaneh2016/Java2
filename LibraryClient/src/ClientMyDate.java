import java.util.ArrayList;
import java.util.Collections;

public class ClientMyDate {

	public static void main(String[] args) {
		
		ArrayList<MyDate> dates = new ArrayList<MyDate>();
		
		dates.add(new MyDate(4, 13, 1743)); // Jefferson
		dates.add(new MyDate(2, 22, 1732)); // Washington
		dates.add(new MyDate(3, 16, 1751)); // Madison
		dates.add(new MyDate(10, 30, 1735)); // Adams
		dates.add(new MyDate(4, 28, 1758)); // Monroe
		System.out.println("birthdays = " + dates);
		
		Collections.sort(dates);
		System.out.println("birthdays = " + dates);

	}

}
