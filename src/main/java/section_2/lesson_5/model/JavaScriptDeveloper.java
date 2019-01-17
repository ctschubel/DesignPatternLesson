package section_2.lesson_5.model;

/**
 * @author ctschubel
 *
 */
public class JavaScriptDeveloper implements Developer{




	public void writeJavaScriptCode() {
		System.out.println("I write Java Script code!");
	}

	@Override
	public void develop() {
		this.writeJavaScriptCode();

	}
}
