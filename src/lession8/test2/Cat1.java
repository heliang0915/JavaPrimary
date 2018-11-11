package lession8.test2;

//继承，子类重写
public class Cat1 extends Animal1 {
	private String eyesColor;

	public Cat1(String name, String color) {
		super(name);
		this.eyesColor = color;
	}

	public void Sounds() {
		System.out.println("猫喵喵叫");
	}

	/**
	 * 展示
	 */
	@Override
	public void display(String kidName) {
		System.out.println( kidName+"名叫" + super.getName() + "的猫，眼睛颜色是" + eyesColor);
	}

	/*
	 * public static void main(String[] args) { Cat1 cat1=new Cat1(); cat1.sounds();
	 * cat1.doRun(); }
	 */

}
