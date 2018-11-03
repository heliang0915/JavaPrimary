package lession5.homework;

public class Rectangle04Test {
    public static void main(String[] args) {
		Rectangle04 re=new Rectangle04(5,10,10,20);
		Rectangle04 re2=new Rectangle04(re);
		
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
