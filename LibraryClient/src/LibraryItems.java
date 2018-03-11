
public class LibraryItems {
	private   int id;
	private String title;

	public LibraryItems(int id,String title) {
		this.id=id;
		this.title=title;	
	}	
	public  int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}	
	public String toString() {		
		return "Id:" + id + " " + " Title: " + title;
	}	
}

