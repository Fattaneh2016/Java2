package ClassSample;

public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public int compareTo(Point other) {
		if (x !=other.x ) {
			return x-other.x;
		}			
		else {
			return y-other.y;
		}
	}
}
