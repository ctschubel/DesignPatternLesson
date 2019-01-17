package section_5.builder_pattern.domain.impl;

import section_5.builder_pattern.domain.HouseBuilder;
import section_5.builder_pattern.model.House;

/**
 * Concrete Builder Class
 * @author chris
 *
 */
public class StoneHouseBuilder extends HouseBuilder {

	private House house;

	public StoneHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasemend() {
		//Complex logic for initialization of basement object
		this.house.setBasement("Basement of a House.");

	}

	@Override
	public void buildKitchen() {
		this.house.setKitchen("Kitchen of a Stone House.");

	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Roof of a Stone House.");

	}

	@Override
	public void buildMaterial() {
		this.house.setMaterial("Stone!");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
