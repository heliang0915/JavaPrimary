package lession7.course.java.ch01.week0;

public class Demo2 {
	public void sayHello() {
		System.out.println("Hello:course.java.ch01.week0.Demo2");
	}

	public static void main(String[] args) {

		Demo1 demo1 = new Demo1();
		demo1.sayHello();
		lession7.course.java.ch02.week3.Demo2 demo2=new lession7.course.java.ch02.week3.Demo2();
		int result = demo2.add(12, 10);
		System.out.println(result);
	}

}
