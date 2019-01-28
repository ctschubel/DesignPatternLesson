package section_5.abstract_factory_pattern.model.impl;

import section_5.abstract_factory_pattern.model.Engine;

/**
 * @author ctschubel
 *
 */
public class FlyEngineImpl extends Engine {

	public FlyEngineImpl() {
		System.out.println("New FlyEngine initialized!");
	}

	@Override
	public void revCounter() {
		System.out.println("100 revs.");

	}

}
