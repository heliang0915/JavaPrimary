package lession4.test;
import java.util.Scanner;

public class Test20181013 {
  
	public static void main(String[] args) {
		Test20181013 t=new Test20181013();
		t.test();
	}
	
	
	public void test() {
		System.out.println("������һ��0~99999����");
		Scanner sc=new Scanner(System.in);
		try {
		int num=sc.nextInt();
		
		if(num<0||num>99999) {
			System.out.println("���ڷ�Χ��");
			test();
		}else {
			System.out.println("����λ��Ϊ:"+(num+"").length()+"λ");
//			test();
		}
		}catch (Exception e) {
			 System.out.println("��������");
			 test();
		}		
		
	}
	
}
