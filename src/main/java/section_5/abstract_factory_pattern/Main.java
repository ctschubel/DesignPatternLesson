package section_5.abstract_factory_pattern;

import section_5.abstract_factory_pattern.domain.impl.ControllerBoardImpl;
import section_5.abstract_factory_pattern.domain.impl.FlyFactoryImpl;
import section_5.abstract_factory_pattern.domain.impl.QuadroFactoryImpl;

/**
 * @author ctschubel
 *
 */
public class Main {

	public static void main(final String[] args) {
		{
			ControllerBoardImpl controller = new ControllerBoardImpl(new FlyFactoryImpl());
			controller.getRegulator().setCurrentCurrent(2);
			controller.getRegulator().getCurrentCurrent();
		}
		{
			ControllerBoardImpl controller = new ControllerBoardImpl(new QuadroFactoryImpl());
			controller.getRegulator().setCurrentCurrent(2);
			controller.getRegulator().getCurrentCurrent();
		}
	}
}
