package lession8.homework.w01;

/**
 * ��������
 * 
 * @Title: Fish.java
 * @Package lession8.homework
 * @Description: ��������
 * @author: ������18 17����
 * @date: Nov 5, 2018 11:39:32 PM
 */
public class Fish extends Animal {
	/**
	 * ����Ĺ���
	 * 
	 * @param name
	 * @param age
	 */
	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public void run() {
		System.out.println("����һ���㣬�ҵ����ֽ�" + super.getName() + "����" + super.getAge() + "�꣬���ܵķ�ʽ��Ӿ");
	}

}
