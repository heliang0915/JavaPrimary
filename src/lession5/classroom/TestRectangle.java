package lession5.classroom;

import java.util.Scanner;

/**
 * ���Ծ��μ���
 * 
 * @author Administrator
 *
 */
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle re = new Rectangle(10,20);
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
