package lession8.test6;

import org.junit.Test;

import lession8.test5.Automobile;
import lession8.test5.Car;
import lession8.test5.Trunk;

public class Test2 {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = str1;

		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true

		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		
		
		Automobile t1=new Trunk(4, "yellow", 10);
		Automobile t2=new Trunk(4, "yellow", 10);
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
	}
	
	@Test
	public void test() {
		
		Automobile t1=new Trunk(4, "yellow", 10);
		Automobile t2=new Trunk(4, "yellow", 10);
		Automobile t3=new Trunk(5, "yellow", 10);
		
		Automobile t4=new Car(5, "yellow", 10);
		Automobile t5=new Car(5, "yellow", 10);
		Automobile t6=t1;
		
		System.out.println("t1 hashCode"+t1.hashCode());
		System.out.println("t2 hashCode"+t2.hashCode());
		System.out.println("t2 hashCode"+t6.hashCode());
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2)); //重写了Object的equal方法只有三个参数都相同才返回true
		System.out.println(t1.equals(t3)); //重写了Object的equal方法只有三个参数都相同才返回true
		System.out.println(t1.equals(t4)); //重写了Object的equal方法只有三个参数都相同才返回true
		System.out.println(t4.equals(t5)); //重写了Object的equal方法只有三个参数都相同才返回true
		System.out.println(t1.equals(t5)); //重写了Object的equal方法只有三个参数都相同才返回true
	}

}
