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
		System.out.println("**********��ӭʹ�ü�����**********");  
        System.out.println("1.�ӷ�����");  
        System.out.println("2.��������");  
        System.out.println("3.�˷�����");  
        System.out.println("4.��������");  
        System.out.println("5.ȡ������");  
        System.out.println("6.�˳�");  
        System.out.println("*******************************");  
	}

	private static void play() {
		// TODO Auto-generated method stub
		int i = 0;  
        double a = 0.0;  
        double b = 0.0;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("������Ҫ���еĲ�����");  
        i = sc.nextInt();  
        while (true) {  
            switch (i) {  
            case 1:  
                System.out.println("�������������мӷ�");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("������Ϊ��" + (a + b));  
                break;  
            case 2:  
                System.out.println("�������������м���");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("������Ϊ��" + (a - b));  
                break;  
            case 3:  
                System.out.println("�������������г˷�");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("������Ϊ��" + (a * b));  
                break;  
            case 4:  
                System.out.println("�������������г���");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("������Ϊ��" + (a / b));  
                break;  
            case 5:  
                System.out.println("��������������ȡ��");  
                a = sc.nextDouble();  
                b = sc.nextDouble();  
                System.out.println("������Ϊ��" + (a % b));  
                break;  
            case 6:  
                System.out.println("*********ллʹ�ã�*********");  
              
            default:  
                System.out.println("��������");  
            }  

  //          menu();  
  //          play();  

        }  
	}
}
