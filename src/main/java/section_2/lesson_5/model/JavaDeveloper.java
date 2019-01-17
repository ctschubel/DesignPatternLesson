package section_2.lesson_5.model;

/**
 * @author ctschubel
 *
 */
public class JavaDeveloper implements Developer{

	public void writeJava() {
		System.out.println("I write Java code!");
	}

	@Override
	public void develop() {
		this.writeJava();

	}
}
