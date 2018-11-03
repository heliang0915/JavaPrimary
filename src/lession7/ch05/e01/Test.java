package lession7.ch05.e01;


public class Test {
	public static void main(String[] args) {
		Shape s = new Shape("Shape1","Red", "Green");
		Circle c = new Circle(new Point(50,100), 10 );
		Rectangle r= new Rectangle(new Point(100,60), 20,15);
		c.setName("Circle1"); 
		c.setFillColor("Bleu");
		c.setBorderColor("yellow");		
		r.setName("Rect1");
		r.setFillColor("Green");
		r.setBorderColor("Red");
		s.draw();
		c.draw();
		r.draw();	
		System.out.println(c.getArea());
		System.out.println(r.getArea());

	}

}
