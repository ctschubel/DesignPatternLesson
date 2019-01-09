package lesson_1;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ctschubel
 *
 */
public class EinkaufsListe {

	private List<String> entries;

	public EinkaufsListe() {

		this.entries = new ArrayList<>();
		}

	public List<String> getEntries() {
		return this.entries;
	}

	public void setEntries(final List<String> entries) {
		this.entries = entries;
	}

	public void addEntry(final String entry) {
		this.entries.add(entry);
		}

	public boolean removeEntry(final String entry) {
		return this.entries.remove(entry);
	}


	@Override
	public String toString() {

		String output = "Einkaufsliste: \n";
		for(String s : this.entries) {
			output += s;
			output += "\n";

		}
		return output;


	}

}
