package lession8.homework.w01;

/**
 * 定义鱼类
 * 
 * @Title: Fish.java
 * @Package lession8.homework
 * @Description: 定义鱼类
 * @author: 计续本18 17何良
 * @date: Nov 5, 2018 11:39:32 PM
 */
public class Fish extends Animal {
	/**
	 * 鱼类的构造
	 * 
	 * @param name
	 * @param age
	 */
	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public void run() {
		System.out.println("我是一条鱼，我的名字叫" + super.getName() + "，我" + super.getAge() + "岁，我跑的方式游泳");
	}

}
