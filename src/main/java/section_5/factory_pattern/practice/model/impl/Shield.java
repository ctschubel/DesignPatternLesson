package section_5.factory_pattern.practice.model.impl;

import section_5.factory_pattern.practice.model.Item;

/**
 * @author ctschubel
 *
 */
public class Shield extends Item {

	private int defenseValue;

	@Override
	public void useItem() {
		System.out.println("Defense!");
	}

	public int getDefenseValue() {
		return this.defenseValue;
	}

	public void setDefenseValue(final int defenseValue) {
		this.defenseValue = defenseValue;
	}

}
