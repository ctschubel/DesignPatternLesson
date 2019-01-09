package lesson_2.model;

/**
 * @author ctschubel
 *
 */
public class Rectangle extends Shape {

	private double width;
	private double height;


	public Rectangle(final double width, final double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(final double width) {
		this.width = width;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(final double height) {
		this.height = height;
	}
	@Override
	public double area() {

		return this.height * this.height;
	}



}
