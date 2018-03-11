package ClassSample;

public class staticClient {
	public static void main ( String[] arg) {
		
		StaticEx s1=new StaticEx();
		System.out.println(s1.getCount());
		StaticEx s2=new StaticEx();
		System.out.println(s2.getCount());
		System.out.println(s1.getCount());		
	}		
}
