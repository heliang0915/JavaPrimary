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
	 * �������
	 * 
	 * @return
	 */
	public double getArea() {
		return pi * radius * radius;
	}

	/**
	 * �����ܳ�
	 * 
	 * @return
	 */
	public double getPerimeter() {
		return 2 * pi * radius;
	}

}
