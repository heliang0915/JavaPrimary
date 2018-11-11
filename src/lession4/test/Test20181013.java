package lession4.test;
import java.util.Scanner;

public class Test20181013 {
  
	public static void main(String[] args) {
		Test20181013 t=new Test20181013();
		t.test();
	}
	
	
	public void test() {
		System.out.println("请输入一个0~99999的数");
		Scanner sc=new Scanner(System.in);
		try {
		int num=sc.nextInt();
		
		if(num<0||num>99999) {
			System.out.println("不在范围内");
			test();
		}else {
			System.out.println("数字位数为:"+(num+"").length()+"位");
//			test();
		}
		}catch (Exception e) {
			 System.out.println("不是整数");
			 test();
		}		
		
	}
	
}
