package lession5.classroom;

public class Circle3 {
	private double radius;
	private double pi = 3.14;


	public Circle3() {
		
	}
	
	public Circle3(double radius) {
		this.radius=radius;
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
