package lession5.classroom;

public class Test2 {

	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		Circle2 c2 = new Circle2();
		c1.setRadius(10);
		c2.setRadius(20);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());

		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
	}

}
