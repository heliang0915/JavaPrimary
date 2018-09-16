package lession2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Title:  Homework.java   
 * @Package lession2   
 * @Description: 0915课后作业题   
 * @author: 计续本18 17何良     
 * @date:   2018年9月16日 下午9:59:38
 */
public class Homework {
	public static void main(String[] args) {
		Homework homeWork = new Homework();
		// 数据类型显示
		homeWork.dataType();
		// 摄氏温度华氏温度转换
		homeWork.converDegree();
		//计算两个数字
		homeWork.computeNum();
	}

	/**
	 * 1题：分别定义int、short、float、double类型的变量，并赋值输出。 
	 * 
	 * @Title: homeWorkType
	 * @Description:数据类型显示 分别定义int、short、float、double类型的变量，并赋值输出。
	 * @author heliang
	 * @date 2018年9月15日下午4:38:08
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

		System.out.println("int 类型" + a);
		System.out.println("float 类型" + b);
		System.out.println("double 类型" + c);
		System.out.println("char 类型" + d);
		System.out.println("byte 类型" + e);
		System.out.println("boolean 类型" + f);
		System.out.println("long 类型" + g);
		System.out.println("short 类型" + h);
	}

	/**
	 * 2题： 1摄氏度(℃)=33.8华氏度(℉)，实现二者之间的转换。 
	 * 
	 * @Title: converDegree
	 * @Description: 转换摄氏度
	 * @author heliang
	 * @date 2018年9月15日下午4:06:26
	 */
	private void converDegree() {
		Scanner sc = new Scanner(System.in);
		double degree; // 摄氏度
		double fahrenheitDegree; // 华氏度
		double result; // 结果
		final double RATE = 33.8; // 进率
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("请输入摄氏度");
		degree = sc.nextDouble();
		result = degree * RATE;
		System.out.println("摄氏度" + degree + "℃===>华氏度" + df.format(result) + "℉");

		System.out.println("请输入华氏度");
		fahrenheitDegree = sc.nextDouble();
		result = fahrenheitDegree / RATE;
		System.out.println("华氏度" + degree + "℉===>摄氏度" + df.format(result) + "℃");
//		sc.close();
	}

	/**
	 * 3题：使用三目运算实现比较2个数的大小，并将小的数加20输出。
	 * 	
	 * @Title: computeNum
	 * @Description: 使用三目运算实现比较2个数的大小，并将小的数加20输出。
	 * @author heliang
	 * @date 2018年9月15日下午4:40:02
	 */
	private void computeNum() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result,min;
		final int addNum=20;
		System.out.println("请输入第一个数字");
		num1 = sc.nextInt();
		System.out.println("请输入第二个数字");
		num2 = sc.nextInt();
		min = num1 < num2 ? num1 : num2;
		result =min+ addNum;
		sc.close();
		System.out.println("比较小的数字为"+min+",最小数字("+min+"+"+addNum+")后的结果为：" + result);
	}
}
