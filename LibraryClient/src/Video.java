
public class Video extends LibraryItems {
	private int length;
	private int year;
	
	public Video(int id, String title,int length,int year) {
		super(id, title);
		this.year=year;
		this.length=length;
		
	}	
	public int getLength() {
		return length;
	}		
	public int getYear() {
		return year;
	}
	public String toString() {
		return   super.toString() + " Length:" + length + " Year: " + year;
	}
}
