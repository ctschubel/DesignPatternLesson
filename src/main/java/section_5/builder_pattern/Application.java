package section_5.builder_pattern;

import section_5.builder_pattern.domain.HouseBuilder;
import section_5.builder_pattern.domain.impl.CivilEngineer;
import section_5.builder_pattern.domain.impl.StoneHouseBuilder;
import section_5.builder_pattern.domain.impl.WoodHouseBuilder;

/**
 * Demo Application
 * @author chris
 *
 */
public class Application {

	public static void main(final String[] args) {
		{
		HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
		CivilEngineer director = new CivilEngineer(woodHouseBuilder);
		director.constructHouse();
		System.out.println(director.getHouse().toString());
		}
		System.out.println();
		{
		HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
		CivilEngineer director = new CivilEngineer(stoneHouseBuilder);
		director.constructHouse();
		System.out.println(director.getHouse().toString());
		}
	}
}
