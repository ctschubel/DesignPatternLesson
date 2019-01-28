package section_5.abstract_factory_pattern.model.impl;

import section_5.abstract_factory_pattern.model.Regulator;

/**
 * @author ctschubel
 *
 */
public class QuadroRegulatorImpl extends Regulator {

	public QuadroRegulatorImpl() {
		System.out.println("Quadro Regulator inizialized");
	}

	@Override
	public void increaseVoltage() {
		// Business Logic
		System.out.println("Increased Voltage!");

	}

}
