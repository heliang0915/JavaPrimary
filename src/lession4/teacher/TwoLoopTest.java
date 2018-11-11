package lession4.teacher;
import java.util.Scanner;

public class TwoLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();  
        play();  
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("**********欢迎使用计算器**********");  
        System.out.println("1.加法运算");  
        System.out.println("2.减法运算");  
        System.out.println("3.乘法运算");  
        System.out.println("4.除法运算");  
        System.out.println("5.取余运算");  
        System.out.println("6.退出");  
        System.out.println("*******************************");  
	}

	private static void play() {
		// TODO Auto-generated method stub
		int i = 0;  
        double a = 0.0;  
        double b = 0.0;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("输入您要进行的操作：");  
        i = sc.nextInt();  
        while (true) {  
            switch (i) {  
            case 1:  
                System.out.println("输入两个数进行加法");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("计算结果为：" + (a + b));  
                break;  
            case 2:  
                System.out.println("输入两个数进行减法");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("计算结果为：" + (a - b));  
                break;  
            case 3:  
                System.out.println("输入两个数进行乘法");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("计算结果为：" + (a * b));  
                break;  
            case 4:  
                System.out.println("输入两个数进行除法");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("计算结果为：" + (a / b));  
                break;  
            case 5:  
                System.out.println("输入两个数进行取余");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("计算结果为：" + (a % b));  
                break;  
            case 6:  
                System.out.println("*********谢谢使用！*********");  
              
            default:  
                System.out.println("输入有误！");  
            }  

  //          menu();  
  //          play();  

        }  
	}
}
