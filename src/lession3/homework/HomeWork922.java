package lession3.homework;
import java.util.Scanner;

import org.junit.Test;

/**
 * 0922课后作业 17 何良
 * 
 * @author heliang
 *
 */
public class HomeWork922 {
	Scanner sc;

	public static void main(String[] args) {
		HomeWork922 hw = new HomeWork922();
		hw.computedPow();
		hw.multiplicationNine();
		hw.phone();
		hw.phoneSwitch();
		hw.evenAndOddSum();
		hw.sort();
	}

	/**
	 * 1、计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
	 */
	@Test
	public void computedPow() {
		int sum = 0;
		for (int i = 1;; i++) {
			sum += Math.pow(i, 2);
			if (sum > 5000) {
				System.out.println("i的值为:" + i);
				System.out.println("结果为:" + sum);
				break;
			}
		}
	}

	/**
	 * 2、输出如下乘法表。
	 */
	@Test
	public void multiplicationNine() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print(" ");
			}

			System.out.println("");
		}
	}

	/**
	 * 3、计算a到b之间所有的奇数和和偶数和并输出（a、b取值自定，值差大于50）
	 */
	@Test
	public void evenAndOddSum() {
		sc = new Scanner(System.in);
		System.out.println("请输入两个数差值大于50");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int oddSum = 0; //奇数
		int evenSum = 0;//偶数
		if (Math.abs(a - b) < 50) { // 差值小于50
			System.out.println("差值小于50,请重新输入");
			evenAndOddSum();
		}else if(a>b) {
			System.out.println("请输入a要小于b");
			evenAndOddSum();
		} else {
			for (int i = a; i < b; i++) {
				if (i % 2 == 0) { // 偶数
					evenSum += i;
				} else {
					oddSum += i;
				}
			}
			System.out.println(a + "和" + b + "之间的奇数和为：" + oddSum);
			System.out.println(a + "和" + b + "之间的偶数和为：" + evenSum);
		}
	}

	/**
	 * 4.假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，
	 * 则输出“移动”、如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。
	 * 如果输入的其他手机号，则输出“未知运营商”。（if、switch）
	 * 
	 */
	@Test
	public void phone() {
		sc = new Scanner(System.in);
		System.out.println("请输入手机号前三位");
		int tel = sc.nextInt();

		if (tel == 136 || tel == 137 || tel == 139) {
			System.out.println("移动");
		} else if (tel == 130 || tel == 131 || tel == 133) {
			System.out.println("电信");
		} else if (tel == 186 || tel == 188) {
			System.out.println("联通");
		} else {
			System.out.println("未知运营商");
		}
	}
	@Test
	public void phoneSwitch() {
		sc = new Scanner(System.in);
		System.out.println("请输入手机号前三位");
		int tel = sc.nextInt();
		switch (tel) {
		case 136:
		case 137:
		case 139:
			System.out.println("移动");
			break;
		case 130:
		case 131:
		case 133:
			System.out.println("电信");
			break;

		case 186:
		case 188:
			System.out.println("联通");
			break;
		default:
			System.out.println("未知运营商");
		}

	}

	/**
	 * 5、编写程序实现对给定的4个整数从大到小的顺序排序。
	 */
	@Test
	public void sort() {
		int[] ary = new int[4];
		ary[0] = 10;
		ary[1] = 4;
		ary[2] = 2;
		ary[3] = 1;
		int temp = 0;
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - 1; j++) {
				if (ary[j] < ary[j + 1]) {
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < ary.length; i++) {
			System.out.println("" + ary[i]);
		}

	}

}
