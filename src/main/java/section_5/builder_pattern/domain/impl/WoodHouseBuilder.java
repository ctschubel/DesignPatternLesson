package section_5.builder_pattern.domain.impl;

import section_5.builder_pattern.domain.HouseBuilder;
import section_5.builder_pattern.model.House;

/**
 * Concrete Builder Class
 * @author chris
 *
 */
public class WoodHouseBuilder extends HouseBuilder {

	private House house;

	public WoodHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasemend() {
		//Complex logic for initialization of basement object
		this.house.setBasement("Basement of a House.");

	}

	@Override
	public void buildKitchen() {
		this.house.setKitchen("Kitchen of a wooden House.");

	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Roof of a wooden House.");

	}

	@Override
	public void buildMaterial() {
		this.house.setMaterial("Wood!");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
