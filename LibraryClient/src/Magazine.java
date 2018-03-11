
public class Magazine extends LibraryItems{
	private String genre;
	private int numberOfPages;
	
	public Magazine(int id, String title,String genre,int numberOfPages) {
		super(id, title);
		this.genre=genre;
		this.numberOfPages=numberOfPages;
				}
	
	public String getGenre() {
		return genre;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public String toString() {		
		return  super.toString() + " Genre:" + genre + " " + " pages:" + numberOfPages;
	}
}
