package lession7.test;


//�̳У����෽��
public class Dog extends Animal {
	String kinds = "";

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.doRun();
		dog1.setKinds("����");
		System.out.println("��������Ϊ��" + dog1.kinds);
	}
}
