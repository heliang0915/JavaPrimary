package lession5.classroom;

/**
 * 
 * @Title: Circle4.java
 * @Package lession5.classroom
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 计续本18 17何良
 * @date: 2018年10月22日 下午9:38:12
 */
public class Circle4 {
	private double radius;
	private int x;
	private int y;
	private double pi = 3.142;

	public Circle4() {
	}

	public Circle4(double radius, int x, int y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public Circle4(Circle4 c) {
		this.x = c.x;
		this.y = c.y;
		this.radius = c.radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return pi * radius * radius;
	}

	public double getPerimeter() {
		return 2 * pi * radius;
	}

}
