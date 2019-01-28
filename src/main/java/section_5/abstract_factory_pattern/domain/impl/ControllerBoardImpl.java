package section_5.abstract_factory_pattern.domain.impl;

import section_5.abstract_factory_pattern.domain.AbstractFactory;
import section_5.abstract_factory_pattern.model.Engine;
import section_5.abstract_factory_pattern.model.Regulator;

/**
 * Klasse in der das die Abstrakte Factory genutzt wird. (Client)
 * 
 * @author ctschubel
 *
 */
public class ControllerBoardImpl {

	private AbstractFactory factory;
	private Regulator regulator;
	private Engine engine;

	public ControllerBoardImpl(final AbstractFactory factory) {
		this.factory = factory;
		this.createParts();
	}

	private void createParts() {
		this.engine = this.factory.createEngine();
		this.regulator = this.factory.createRegulator();

	}

	public AbstractFactory getFactory() {
		return this.factory;
	}

	public void setFactory(final AbstractFactory factory) {
		this.factory = factory;
	}

	public Regulator getRegulator() {
		return this.regulator;
	}

	public void setRegulator(final Regulator regulator) {
		this.regulator = regulator;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(final Engine engine) {
		this.engine = engine;
	}

}
