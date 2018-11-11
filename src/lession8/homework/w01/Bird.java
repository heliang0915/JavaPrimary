package lession8.homework.w01;

/**
 * 定义鸟类
 * 
 * @Title: Bird.java
 * @Package lession8.homework
 * @Description: 定义鸟类
 * @author: 计续本18 17何良
 * @date: Nov 5, 2018 11:39:03 PM
 */
public class Bird extends Animal {
   /**
    * 鸟类构造方法
    * @param name
    * @param age
    */
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void run() {
		System.out.println("我是一只鸟，我的名字叫" + super.getName() + "，我" + super.getAge() + "岁，我跑的方式是飞行");

	}

}
