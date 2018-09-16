package lession2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Title:  Homework.java   
 * @Package lession2   
 * @Description: 0915�κ���ҵ��   
 * @author: ������18 17����     
 * @date:   2018��9��16�� ����9:59:38
 */
public class Homework {
	public static void main(String[] args) {
		Homework homeWork = new Homework();
		// ����������ʾ
		homeWork.dataType();
		// �����¶Ȼ����¶�ת��
		homeWork.converDegree();
		//������������
		homeWork.computeNum();
	}

	/**
	 * 1�⣺�ֱ���int��short��float��double���͵ı���������ֵ����� 
	 * 
	 * @Title: homeWorkType
	 * @Description:����������ʾ �ֱ���int��short��float��double���͵ı���������ֵ�����
	 * @author heliang
	 * @date 2018��9��15������4:38:08
	 */
	private void dataType() {
		int a = 10;
		float b = 12f;
		double c = 12;
		char d = 'a';
		byte e = 30;
		boolean f = true;
		long g = 10L;
		short h = 50;

		System.out.println("int ����" + a);
		System.out.println("float ����" + b);
		System.out.println("double ����" + c);
		System.out.println("char ����" + d);
		System.out.println("byte ����" + e);
		System.out.println("boolean ����" + f);
		System.out.println("long ����" + g);
		System.out.println("short ����" + h);
	}

	/**
	 * 2�⣺ 1���϶�(��)=33.8���϶�(�H)��ʵ�ֶ���֮���ת���� 
	 * 
	 * @Title: converDegree
	 * @Description: ת�����϶�
	 * @author heliang
	 * @date 2018��9��15������4:06:26
	 */
	private void converDegree() {
		Scanner sc = new Scanner(System.in);
		double degree; // ���϶�
		double fahrenheitDegree; // ���϶�
		double result; // ���
		final double RATE = 33.8; // ����
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("���������϶�");
		degree = sc.nextDouble();
		result = degree * RATE;
		System.out.println("���϶�" + degree + "��===>���϶�" + df.format(result) + "�H");

		System.out.println("�����뻪�϶�");
		fahrenheitDegree = sc.nextDouble();
		result = fahrenheitDegree / RATE;
		System.out.println("���϶�" + degree + "�H===>���϶�" + df.format(result) + "��");
//		sc.close();
	}

	/**
	 * 3�⣺ʹ����Ŀ����ʵ�ֱȽ�2�����Ĵ�С������С������20�����
	 * 	
	 * @Title: computeNum
	 * @Description: ʹ����Ŀ����ʵ�ֱȽ�2�����Ĵ�С������С������20�����
	 * @author heliang
	 * @date 2018��9��15������4:40:02
	 */
	private void computeNum() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result,min;
		final int addNum=20;
		System.out.println("�������һ������");
		num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		num2 = sc.nextInt();
		min = num1 < num2 ? num1 : num2;
		result =min+ addNum;
		sc.close();
		System.out.println("�Ƚ�С������Ϊ"+min+",��С����("+min+"+"+addNum+")��Ľ��Ϊ��" + result);
	}
}
