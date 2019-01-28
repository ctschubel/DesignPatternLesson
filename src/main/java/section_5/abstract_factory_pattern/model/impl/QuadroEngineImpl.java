package section_5.abstract_factory_pattern.model.impl;

import section_5.abstract_factory_pattern.model.Engine;

/**
 * @author ctschubel
 *
 */
public class QuadroEngineImpl extends Engine {

	public QuadroEngineImpl() {
		System.out.println("New QuadroEngine initialized!");
	}

	@Override
	public void revCounter() {
		System.out.println("300 revs.");

	}

}
