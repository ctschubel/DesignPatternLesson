package section_2.lesson_5.model;

import java.util.List;

/**
 * @author ctschubel
 *
 */
public class SoftwareProject {

	private List<Developer> developers;

	public SoftwareProject(final List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {

		for (Developer dev : this.developers) {
			dev.develop();

		}
	}

}
