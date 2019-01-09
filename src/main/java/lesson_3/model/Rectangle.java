package lesson_3.model;

/**
 * @author ctschubel
 *
 */
public class Rectangle {

	protected double height;
	protected double width;

	 public Rectangle(final double width, final double height) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(final double height) {
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(final double width) {
		this.width = width;
	}

	//If square class is not that important remove it and use this to meet liskov principle.
	public boolean isSquare() {
		return this.height == this.width;
	}


	 public double area() {
		return this.height * this.width;
	}
}
