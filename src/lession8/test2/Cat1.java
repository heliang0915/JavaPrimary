package lession8.test2;

//�̳У�������д
public class Cat1 extends Animal1 {
	private String eyesColor;

	public Cat1(String name, String color) {
		super(name);
		this.eyesColor = color;
	}

	public void Sounds() {
		System.out.println("è������");
	}

	/**
	 * չʾ
	 */
	@Override
	public void display(String kidName) {
		System.out.println( kidName+"����" + super.getName() + "��è���۾���ɫ��" + eyesColor);
	}

	/*
	 * public static void main(String[] args) { Cat1 cat1=new Cat1(); cat1.sounds();
	 * cat1.doRun(); }
	 */

}
