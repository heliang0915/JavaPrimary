package lession3.keshang;

import java.util.Scanner;

/**
 * 2.���벻ͬ��ֵ���жϲ�����óɼ��������в�ȼ���
 * @author Administrator
 *
 */
public class Switch {
	private Scanner sc;
	
	public static void main(String[] args) {
		Switch t = new Switch();
		t.testSwitch();
		t.testIf();
	}

	public void testSwitch() {
		sc = new Scanner(System.in);
		System.out.println("��������ĳɼ�:");
		int score = sc.nextInt();
		int n = score / 10;
		switch (n) {
		case 10:
		case 9:
			System.out.println("�ɼ�����");
			break;
		case 8:
			System.out.println("�ɼ�����");
			break;
		case 7:
			System.out.println("�ɼ���");
			break;
		case 6:
			System.out.println("��ϲ�㼰����");
			break;
		default:
			System.out.println("�ɼ�û���أ�������");
		}
	}

	public void testIf() {
		sc = new Scanner(System.in);
		System.out.println("��������ĳɼ�:");
		int score = sc.nextInt();

		int n = score / 10;
		if (n == 9 || n == 10) {
			System.out.println("�ɼ�����");
		} else if (n == 8) {
			System.out.println("�ɼ�����");
		} else if (n == 7) {
			System.out.println("�ɼ���");
		} else if (n == 6) {
			System.out.println("��ϲ�㼰����");
		} else {
			System.out.println("�ɼ�û���أ�������");
		}

	}
}
