package section_5.factory_pattern.practice.domain.impl;

import java.util.Random;

import section_5.factory_pattern.practice.domain.ItemFactory;
import section_5.factory_pattern.practice.model.Item;
import section_5.factory_pattern.practice.model.impl.Shield;
import section_5.factory_pattern.practice.model.impl.Sword;

/**
 * @author ctschubel
 *
 */
public class RandomItemFactoryImpl extends ItemFactory {

	private Random random = new Random();

	@Override
	public Item itemFactory() {

		return randomItem();
	}

	private Item randomItem() {

		int item = this.random.nextInt(2);
		return item == 1 ? new Shield() : new Sword();

	}

}
