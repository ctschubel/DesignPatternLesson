package lesson_2;

import lesson_2.model.Circle;
import lesson_2.model.Rectangle;
import lesson_2.model.Shape;
import lesson_2.service.AreaCalculator;

/**
 * @author ctschubel
 *
 */
public class Application {


public static void main(final String[] args) {

	AreaCalculator calculator = new AreaCalculator();

	Rectangle rec1 = new Rectangle(5, 5); //25
	Rectangle rec2 = new Rectangle(4, 4); //16
	Rectangle rec3 = new Rectangle(7, 7); //49
	Rectangle rec4 = new Rectangle(2, 3); //6

	Circle circle1 = new Circle(3); //28.274...

	Shape[] shapes = new Shape[] {rec1, rec2, rec3, rec4, circle1};

	double calculateRectangleArea = calculator.calculateArea(shapes);
	System.out.println(calculateRectangleArea);


}

}
