package lession5.homework;

/**
 * 测试矩形计算
 * 
 * @author Administrator
 *
 */
public class Rectangle02Test {
	public static void main(String[] args) {
		Rectangle02 re = new Rectangle02();
		re.setL(10);
		re.setW(20);
		System.out.println("矩形面积" + re.area());
		System.out.println("矩形周长" + re.perimeter());
	}

}
