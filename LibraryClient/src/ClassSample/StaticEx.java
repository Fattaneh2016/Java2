package ClassSample;

public class StaticEx {
	
		private static int count1=10;
		public StaticEx() {
			count1++;
		}
		public static int getCount() {
			return count1;
			
		}
	}
