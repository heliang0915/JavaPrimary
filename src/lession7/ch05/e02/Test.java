package lession7.ch05.e02;


public class Test {
	public static void main(String[] args) {
		Shape s = new Shape("Shape1","Red", "Green");
		Circle c = new Circle("Circle1", "blue", "red", new Point(50,100),10);
		Rectangle r= new Rectangle("Rect1", "Yellow", "Red",new Point(100,60), 20,15);

		s.draw();
		c.draw();
		r.draw();
		
//		Circle c = new Circle(new Point(50,100),10);

	}

}
