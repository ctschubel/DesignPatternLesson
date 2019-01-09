package lesson_3;

import lesson_3.model.Rectangle;
import lesson_3.model.Square;

/**
 * @author ctschubel
 *
 */
public class Application {

	public static void main(final String[] args) {
		Rectangle rec1 = new Rectangle(4, 5);
		checkIfSubstitutable(rec1);

		Square s1 = new Square(3);
		checkIfSubstitutable(s1);

	}

	public static void checkIfSubstitutable(final Rectangle rec) {

		double height = rec.getHeight();
		rec.setWidth(20);
		//20 * height
		System.out.println("Expected: " + 20 * height);
		System.out.println("Actual: " + rec.area());
		}
}
