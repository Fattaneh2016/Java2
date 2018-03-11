
public class Book extends LibraryItems{
	private int year;
	private String author;

	public Book(int id, String title,int year, String author) {
		super(id, title);
		this.year=year;
		this.author=author;
	}	
	public int getYear() {
		return year;		
	}	
	public String getAuthor() {
		return author;
	}
	public boolean equals(Object o ) {
		if( o instanceof Book) {
			Book other = (Book) o; 		
			
			return year == other.year &&  super.getTitle()==other.getTitle() &&  author==other.author; 
		}
		else {
			return false;
		}
	}
	public String toString() {		
		return  super.toString() +  " Year:" + year + " " + " Author:" +  author;
	}
}


