package section_5.abstract_factory_pattern.model;

/**
 * @author ctschubel
 *
 */
public abstract class Regulator {
	private double currentVoltage;
	private double currentCurrent;

	public abstract void increaseVoltage();

	public double getCurrentVoltage() {
		return this.currentVoltage;
	}

	public void setCurrentVoltage(final double currentVoltage) {
		this.currentVoltage = currentVoltage;
	}

	public double getCurrentCurrent() {
		return this.currentCurrent;
	}

	public void setCurrentCurrent(final double currentCurrent) {
		this.currentCurrent = currentCurrent;
	}

}
