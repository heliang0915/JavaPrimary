package lession5;

public class Rectangle2Test {
    public static void main(String[] args) {
		Rectangle2 re=new Rectangle2(5,10,10,20);
		Rectangle2 re2=new Rectangle2(re);
		
		System.out.println("re.getX():"+re.getX());
		System.out.println("re.getY():"+re.getY());
		System.out.println("面积为:"+re.getArea());
		System.out.println("周长为:"+re.getPermitter());
		
		System.out.println("re2.getX():"+re2.getX());
		System.out.println("re2.getY():"+re2.getY());
		System.out.println("面积为:"+re.getArea());
		System.out.println("周长为:"+re.getPermitter());
	}
}
