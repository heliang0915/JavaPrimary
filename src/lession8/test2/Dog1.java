package lession8.test2;

//子类重写
public class Dog1 extends Animal1 {
	private String furColor;

	public Dog1(String name, String color) {
		super(name);
		this.furColor = color;
	}

	public void doRun() {
		System.out.println("狗有四条腿，会跑！");
	}

	public void Sounds() {
		System.out.println("狗汪汪叫");
	}

	/**
	 * 展示
	 */
	@Override
	public void display(String kidName) {
		System.out.println(kidName + "的宠物是一只名叫" + super.getName() + "的狗，皮毛的颜色是" + furColor);
	}

	/*
	 * public static void main(String[] args) { Dog1 dog2 = new Dog1();
	 * dog2.doRun(); dog2.doEat(); dog2.sounds(); }
	 */
}
