package lession8.homework.w01;

/**
 * ���嶯�������
 * @Title:  Animal.java   
 * @Package lession8.homework   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ������18 17����     
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
	 * ����run����
	 * @Title: run   
	 * @Description:����run����
	 * @param:       
	 * @return: void      
	 */
	public abstract void run();
}
