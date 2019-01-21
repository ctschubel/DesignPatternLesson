package section_5.factory_pattern.practice.model;

/**
 * @author ctschubel
 *
 */
public abstract class Item {
	public String name;
	public String id;

	public abstract void useItem();

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

}
