package section_5.builder_pattern.domain.impl;

import section_5.builder_pattern.domain.HouseBuilder;
import section_5.builder_pattern.model.House;

/**
 * Director class of Builder Pattern.
 * @author chris
 *
 */
public class CivilEngineer {
	private HouseBuilder houseBuilder;

	 public CivilEngineer(final HouseBuilder houseBuilder) {
		 this.houseBuilder = houseBuilder;
	}

	/**
	 * This method constructs the objects.
	 * In some use cases its important to call the methods of the builder in the correct order usw.
	 * This method meets all necessary requirements for the construction process.
	 */
	public void constructHouse() {

		this.houseBuilder.buildBasemend();
		this.houseBuilder.buildMaterial();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildKitchen();

	}

	public House getHouse() {
		return this.houseBuilder.getHouse();
	}





}
