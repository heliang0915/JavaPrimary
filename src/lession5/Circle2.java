package lession5;

public class Circle2 {
	private double radius;
	private double pi = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

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
