package lession8.test2;

public class Bird1 extends Animal1 {
	private boolean hasWings;

	public Bird1(String name, boolean hasWings) {
		super(name);
		this.hasWings = hasWings;
	}

	public void Sounds() {
		System.out.println("��������");
	}

	/**
	 * չʾ
	 */
	@Override
	public void display(String kidName) {
		System.out.println(kidName + "�ĳ�����һֻ����" + super.getName() + "�����Ƿ��ų��" + hasWings);
	}

}
