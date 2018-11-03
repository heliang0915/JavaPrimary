package lession5.classroom;

public class Test1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.radius = 10;
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		c2.radius = 20;
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		c1.radius = 30;
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
	}
}
