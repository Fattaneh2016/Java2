
public class LibraryClient {
	public static void main(String[] arg) {

		Book b1=new Book (1,"Building Java Programs", 2017,"Stuart");  		
		Magazine m1=new Magazine(2,"wired","technology",20);  
		Video v1=new Video(3,"wild life",50, 2001);  
		Book b2= new Book (4,"Building Java Programs", 2017,"Stuart"); 

		System.out.println(b1);  
		System.out.println(b2);  
		System.out.println("equal ?: "+ b1.equals(b2)); 
		System.out.println(m1);  
		System.out.println(v1);	 

	}
}

