package ClassSample;

import java.util.Set;
import java.util.TreeSet;

public class HtmlTagClient {

	public static void main(String[] args) {
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
