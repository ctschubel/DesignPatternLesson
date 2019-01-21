package section_5.factory_pattern.practice;

import section_5.factory_pattern.practice.domain.ItemFactory;
import section_5.factory_pattern.practice.domain.impl.RandomItemFactoryImpl;

/**
 * @author ctschubel
 *
 */
public class Application {

	public static void main(final String[] args) {
		ItemFactory itemFactory = new RandomItemFactoryImpl();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
		itemFactory.getItem().useItem();
	}

}
