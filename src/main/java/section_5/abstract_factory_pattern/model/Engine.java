package section_5.abstract_factory_pattern.model;

/**
 * @author ctschubel
 *
 */
public abstract class Engine {
	private double engineSpeed;

	public abstract void revCounter();

	public double getEngineSpeed() {
		return this.engineSpeed;
	}

	public void setEngineSpeed(final double engineSpeed) {
		this.engineSpeed = engineSpeed;
	}

}
