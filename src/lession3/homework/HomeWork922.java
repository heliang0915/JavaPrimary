package lession3.homework;
import java.util.Scanner;

import org.junit.Test;

/**
 * 0922�κ���ҵ 17 ����
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
	 * 1������1^2+2^2+3^2+...+i^2...���������5000ʱֹͣ���㣬�������Ͷ�Ӧ��iֵ��
	 */
	@Test
	public void computedPow() {
		int sum = 0;
		for (int i = 1;; i++) {
			sum += Math.pow(i, 2);
			if (sum > 5000) {
				System.out.println("i��ֵΪ:" + i);
				System.out.println("���Ϊ:" + sum);
				break;
			}
		}
	}

	/**
	 * 2��������³˷���
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
	 * 3������a��b֮�����е������ͺ�ż���Ͳ������a��bȡֵ�Զ���ֵ�����50��
	 */
	@Test
	public void evenAndOddSum() {
		sc = new Scanner(System.in);
		System.out.println("��������������ֵ����50");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int oddSum = 0; //����
		int evenSum = 0;//ż��
		if (Math.abs(a - b) < 50) { // ��ֵС��50
			System.out.println("��ֵС��50,����������");
			evenAndOddSum();
		}else if(a>b) {
			System.out.println("������aҪС��b");
			evenAndOddSum();
		} else {
			for (int i = a; i < b; i++) {
				if (i % 2 == 0) { // ż��
					evenSum += i;
				} else {
					oddSum += i;
				}
			}
			System.out.println(a + "��" + b + "֮���������Ϊ��" + oddSum);
			System.out.println(a + "��" + b + "֮���ż����Ϊ��" + evenSum);
		}
	}

	/**
	 * 4.�����ܹ������ֻ��ŵ�ǰ��λ�ж���Ӫ�̣����������ֻ���ǰ��λ��136��137��138��139��
	 * ��������ƶ����������130��131��133������������š��������186��188�����������ͨ����
	 * �������������ֻ��ţ��������δ֪��Ӫ�̡�����if��switch��
	 * 
	 */
	@Test
	public void phone() {
		sc = new Scanner(System.in);
		System.out.println("�������ֻ���ǰ��λ");
		int tel = sc.nextInt();

		if (tel == 136 || tel == 137 || tel == 139) {
			System.out.println("�ƶ�");
		} else if (tel == 130 || tel == 131 || tel == 133) {
			System.out.println("����");
		} else if (tel == 186 || tel == 188) {
			System.out.println("��ͨ");
		} else {
			System.out.println("δ֪��Ӫ��");
		}
	}
	@Test
	public void phoneSwitch() {
		sc = new Scanner(System.in);
		System.out.println("�������ֻ���ǰ��λ");
		int tel = sc.nextInt();
		switch (tel) {
		case 136:
		case 137:
		case 139:
			System.out.println("�ƶ�");
			break;
		case 130:
		case 131:
		case 133:
			System.out.println("����");
			break;

		case 186:
		case 188:
			System.out.println("��ͨ");
			break;
		default:
			System.out.println("δ֪��Ӫ��");
		}

	}

	/**
	 * 5����д����ʵ�ֶԸ�����4�������Ӵ�С��˳������
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
