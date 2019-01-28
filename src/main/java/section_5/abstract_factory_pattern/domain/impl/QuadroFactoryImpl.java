package section_5.abstract_factory_pattern.domain.impl;

import section_5.abstract_factory_pattern.domain.AbstractFactory;
import section_5.abstract_factory_pattern.model.Engine;
import section_5.abstract_factory_pattern.model.Regulator;
import section_5.abstract_factory_pattern.model.impl.QuadroEngineImpl;
import section_5.abstract_factory_pattern.model.impl.QuadroRegulatorImpl;

/**
 * @author ctschubel
 *
 */
public class QuadroFactoryImpl implements AbstractFactory {

	@Override
	public Regulator createRegulator() {
		return new QuadroRegulatorImpl();
	}

	@Override
	public Engine createEngine() {
		return new QuadroEngineImpl();
	}

}
