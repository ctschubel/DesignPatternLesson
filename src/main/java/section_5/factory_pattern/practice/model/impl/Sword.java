package section_5.factory_pattern.practice.model.impl;

import section_5.factory_pattern.practice.model.Item;

/**
 * @author ctschubel
 *
 */
public class Sword extends Item{

	private int attackValue;

	@Override
	public void useItem() {
		System.out.println("Attack!");
	
	}

	public int getAttackValue() {
		return this.attackValue;
	}

	public void setAttackValue(final int attackValue) {
		this.attackValue = attackValue;
	}

}
