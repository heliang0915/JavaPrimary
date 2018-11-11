package lession8.homework.w01;

/**
 * 定义动物抽象类
 * @Title:  Animal.java   
 * @Package lession8.homework   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 计续本18 17何良     
 * @date:   Nov 5, 2018 11:38:09 PM
 */
public abstract class Animal {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 定义run方法
	 * @Title: run   
	 * @Description:定义run方法
	 * @param:       
	 * @return: void      
	 */
	public abstract void run();
}
