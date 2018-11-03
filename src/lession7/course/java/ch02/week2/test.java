package lession7.course.java.ch02.week2;

import lession7.course.java.ch02.week3.Demo2;

public class test {

	public static void main(String[] args) {

		Demo1 demo1 = new Demo1();
		demo1.test1();

		Demo2 demo = new Demo2();
		int result = demo.add(12, 33);
		System.out.println(result);
	}

}
