package section_5.builder_pattern.domain;

import section_5.builder_pattern.model.House;

/**
 * Abstract builder class.
 * @author chris
 *
 */
public abstract class HouseBuilder {

	public abstract void buildBasemend();
	public abstract void buildKitchen();
	public abstract void buildRoof();
	public abstract void buildMaterial();
	public abstract House getHouse();


}
