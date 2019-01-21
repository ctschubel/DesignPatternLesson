package section_5.factory_pattern.practice.domain;

import section_5.factory_pattern.practice.model.Item;

/**
 * @author ctschubel
 *
 */
public abstract class ItemFactory {

	public abstract Item itemFactory();

	public Item getItem() {
		return itemFactory();
	}

}
