import java.util.*;

public class HtmlTagClient{
	public static void main(String[] args){
		Set<HtmlTag> tags = new TreeSet<HtmlTag>();
		tags.add(new HtmlTag("body", true));   // <body>
		tags.add(new HtmlTag("b", true));      // <b>
		tags.add(new HtmlTag("b", false));     // </b>
		tags.add(new HtmlTag("i", true));      // <i>
		tags.add(new HtmlTag("b", true));      // <b>
		tags.add(new HtmlTag("b", false));     // </b>
		tags.add(new HtmlTag("br"));           // <br/>
		tags.add(new HtmlTag("i", false));     // </i>
		tags.add(new HtmlTag("body", false));  // </body>
		System.out.println(tags);
	}
}

class HtmlTag implements Comparable<HtmlTag>{
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
			return compare;} else {// same tag
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