package lession8.homework.w01;

/**
 * ��������
 * 
 * @Title: Bird.java
 * @Package lession8.homework
 * @Description: ��������
 * @author: ������18 17����
 * @date: Nov 5, 2018 11:39:03 PM
 */
public class Bird extends Animal {
   /**
    * ���๹�췽��
    * @param name
    * @param age
    */
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void run() {
		System.out.println("����һֻ���ҵ����ֽ�" + super.getName() + "����" + super.getAge() + "�꣬���ܵķ�ʽ�Ƿ���");

	}

}
