package section_2.lesson_2.model;

/**
 * @author ctschubel
 *
 */
public class Circle extends Shape {

	private double radius;

	public Circle(final double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(final double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		return this.radius * this.radius * Math.PI;
	}


}
