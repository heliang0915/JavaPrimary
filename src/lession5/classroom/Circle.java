package lession5.classroom;

public class Circle {
	double radius;
	double pi = 3.14;

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
