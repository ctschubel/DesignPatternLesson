package lesson_3.model;


//This class does not fulfil the liskov principle because it modifies the funcionality of the class it extends!!
/**
 * @author ctschubel
 *
 */
public class Square extends Rectangle{

	public Square(final double size) {
		super(size, size);
	}

	@Override
	public void setHeight(final double height) {
		super.setWidth(height);
		super.setHeight(height);
	}

	@Override
	public void setWidth(final double width) {
		super.setHeight(width);
		super.setWidth(width);
	}



}
