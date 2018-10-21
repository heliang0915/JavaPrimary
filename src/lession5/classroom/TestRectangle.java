package lession5.classroom;

import java.util.Scanner;

/**
 * 测试矩形计算
 * 
 * @author Administrator
 *
 */
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle re = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入矩形的长");
		re.setL(sc.nextInt());
		System.out.println("请输入矩形的宽");
		re.setW(sc.nextInt());
		System.out.println("矩形面积" + re.area());
		System.out.println("矩形周长" + re.perimeter());
		sc.close();
	}

}
