package lession5.homework;

import java.util.Scanner;

/**
 * ���Ծ��μ���
 * 
 * @author Administrator
 *
 */
public class Rectangle03Test {
	public static void main(String[] args) {
		Rectangle03 re = new Rectangle03(10,20);
		System.out.println("Ĭ�ϵĿ�"+re.getW());
		System.out.println("Ĭ�ϵĳ�"+re.getL());
		Scanner sc = new Scanner(System.in);
		System.out.println("��������εĳ�");
		re.setL(sc.nextInt());
		System.out.println("��������εĿ�");
		re.setW(sc.nextInt());
		System.out.println("�������" + re.area());
		System.out.println("�����ܳ�" + re.perimeter());
		sc.close();
	}

}
