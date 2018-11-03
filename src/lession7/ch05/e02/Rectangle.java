package lession7.ch05.e02;


public class Rectangle extends Shape {
	private Point topLeft;
	private double length;
	private double width;
	public Rectangle(String name, String fillColor, String borderColor,Point topLeft, double length, double width) {
		super(name, fillColor, borderColor);
		this.topLeft = topLeft;
		this.length = length;
		this.width = width;
	}
	public Point getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea(){
		return length * width;
	}

}
