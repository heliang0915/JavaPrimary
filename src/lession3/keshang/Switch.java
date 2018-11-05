package lession3.keshang;

import java.util.Scanner;

/**
 * 2.输入不同分值，判断并输出该成绩的优良中差等级。
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
		System.out.println("请输入你的成绩:");
		int score = sc.nextInt();
		int n = score / 10;
		switch (n) {
		case 10:
		case 9:
			System.out.println("成绩优秀");
			break;
		case 8:
			System.out.println("成绩良好");
			break;
		case 7:
			System.out.println("成绩良");
			break;
		case 6:
			System.out.println("恭喜你及格了");
			break;
		default:
			System.out.println("成绩没过关！！！！");
		}
	}

	public void testIf() {
		sc = new Scanner(System.in);
		System.out.println("请输入你的成绩:");
		int score = sc.nextInt();

		int n = score / 10;
		if (n == 9 || n == 10) {
			System.out.println("成绩优秀");
		} else if (n == 8) {
			System.out.println("成绩良好");
		} else if (n == 7) {
			System.out.println("成绩良");
		} else if (n == 6) {
			System.out.println("恭喜你及格了");
		} else {
			System.out.println("成绩没过关！！！！");
		}

	}
}
