package lession5;

public class Circle {
	double radius;
	double pi = 3.14;

	/**
	 * 计算面积
	 * 
	 * @return
	 */
	public double getArea() {
		return pi * radius * radius;
	}

	/**
	 * 计算周长
	 * 
	 * @return
	 */
	public double getPerimeter() {
		return 2 * pi * radius;
	}

}
