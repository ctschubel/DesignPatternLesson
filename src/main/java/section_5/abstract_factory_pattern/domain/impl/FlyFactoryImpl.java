package section_5.abstract_factory_pattern.domain.impl;

import section_5.abstract_factory_pattern.domain.AbstractFactory;
import section_5.abstract_factory_pattern.model.Engine;
import section_5.abstract_factory_pattern.model.Regulator;
import section_5.abstract_factory_pattern.model.impl.FlyEngineImpl;
import section_5.abstract_factory_pattern.model.impl.FlyRegulatorImpl;

/**
 * @author ctschubel
 *
 */
public class FlyFactoryImpl implements AbstractFactory {

	@Override
	public Regulator createRegulator() {
		return new FlyRegulatorImpl();
	}

	@Override
	public Engine createEngine() {
		return new FlyEngineImpl();
	}

}
