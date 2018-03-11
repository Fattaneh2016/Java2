package ClassSample;

public class HtmlTag implements Comparable<HtmlTag>{
	private String element;
	private boolean isOpen;
	private boolean combined; //true if the tag is combined tag like <br/>
	
	public HtmlTag(String element, boolean isOpen){
		this.element = element;
		this.isOpen = isOpen;
		combined =false;
	}
	
	public HtmlTag(String element){
		this.element = element;
		isOpen = false;
		combined = true;
	}
	
	public boolean isOpenTag(){
		return isOpen;
	}
	
	public boolean isCombined(){
		return combined;
	}
	
	public String getElement(){
		return element;
	}
	
	public String toString(){
		if(isCombined()){
				return "<"+element+"/>";
		}else if(isOpenTag())
			return "<"+element+">";
		else
			return "</"+element+">";
	}
	
	public int compareTo(HtmlTag other) {
		int compare = element.compareTo(other.getElement());
		if (compare != 0) {
			// different tags; use String's compareTo result
			return compare;
		} else 
		{// same tag
		if (isOpenTag() == other.isOpenTag()) {
			return 0;   // exactly the same kind of tag
			} else if (other.isOpenTag()) {
				return 1;   // he=open, I=close; I am after
			} else {
				return -1;  // I=open, he=close; I am before
			}
		}
	}
	
}
