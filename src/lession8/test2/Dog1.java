package lession8.test2;

//������д
public class Dog1 extends Animal1 {
	private String furColor;

	public Dog1(String name, String color) {
		super(name);
		this.furColor = color;
	}

	public void doRun() {
		System.out.println("���������ȣ����ܣ�");
	}

	public void Sounds() {
		System.out.println("��������");
	}

	/**
	 * չʾ
	 */
	@Override
	public void display(String kidName) {
		System.out.println(kidName + "�ĳ�����һֻ����" + super.getName() + "�Ĺ���Ƥë����ɫ��" + furColor);
	}

	/*
	 * public static void main(String[] args) { Dog1 dog2 = new Dog1();
	 * dog2.doRun(); dog2.doEat(); dog2.sounds(); }
	 */
}
