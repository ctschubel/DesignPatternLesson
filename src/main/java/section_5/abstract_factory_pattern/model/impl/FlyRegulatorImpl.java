package section_5.abstract_factory_pattern.model.impl;

import section_5.abstract_factory_pattern.model.Regulator;

/**
 * @author ctschubel
 *
 */
public class FlyRegulatorImpl extends Regulator {

	public FlyRegulatorImpl() {
		System.out.println("Fly Regulator Initialized.");
	}

	@Override
	public void increaseVoltage() {
		System.out.println("Voltage was Increased!");

	}

}
