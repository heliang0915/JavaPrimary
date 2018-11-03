package lession7.ch05.e01;


public class Circle extends Shape {
	private Point center;
	private double radius;
	public Circle(Point center, double radius) {
//		super();
		this.center = center;
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}

	public double getArea(){
		return Math.PI * radius * radius;
	}
}
