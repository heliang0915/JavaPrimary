package lession5.homework;

/**
 * 测试矩形计算
 * 
 * @author Administrator
 *
 */
public class Rectangle01Test {
	public static void main(String[] args) {
		Rectangle01 re = new Rectangle01();
		re.w = 20;
		re.l = 10;
		System.out.println("矩形面积" + re.area());
		System.out.println("矩形周长" + re.perimeter());
	}

}
