package seedu.addressbook.data.tag;

import java.util.ArrayList;

public class Tagging {
	private ArrayList<String> TagLog;
	
	public Tagging() {
		this.TagLog = new ArrayList<String>();
	}
	
	public void addTagHistory(String name, String tags, String prefix) {
		this.TagLog.add(prefix + " " + name + " " + tags);
	}
	
	public String getTagHistory() {
		String output = "";
		while (TagLog.size() != 0) {
			output += "\r" + this.TagLog.remove(0);
		}
		return output;
	}
	
}
