package section_5.builder_pattern.model;

/**
 * Concrete house object.
 * @author chris
 *
 */
public class House {
	//In Real life usecase this Sting objects are some quite complex objects, which are difficult to initialize
	private String basement;
	private String roof;
	private String material;
	private String kitchen;

	public String getBasement() {
		return this.basement;
	}
	public void setBasement(final String basement) {
		this.basement = basement;
	}
	public String getRoof() {
		return this.roof;
	}
	public void setRoof(final String roof) {
		this.roof = roof;
	}
	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(final String material) {
		this.material = material;
	}
	public String getKitchen() {
		return this.kitchen;
	}
	public void setKitchen(final String kitchen) {
		this.kitchen = kitchen;
	}

	@Override
	public String toString() {
		return "Basement: " + this.basement + "\nMaterial: " + this.material + "\nKitchen: " + this.kitchen + "\nRoof: " + this.roof;
	}

}
