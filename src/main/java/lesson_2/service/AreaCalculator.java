package lesson_2.service;

import lesson_2.model.Shape;

/**
 * @author ctschubel
 *
 */
public class AreaCalculator {

	public double calculateArea(final Shape[] shapes) {
		double area = 0;

		for(Shape shape : shapes) {
			area += shape.area();
		}

		return area;
	}
}
