package lession8.test2;

public class Bird1 extends Animal1 {
	private boolean hasWings;

	public Bird1(String name, boolean hasWings) {
		super(name);
		this.hasWings = hasWings;
	}

	public void Sounds() {
		System.out.println("鸟喳喳叫");
	}

	/**
	 * 展示
	 */
	@Override
	public void display(String kidName) {
		System.out.println(kidName + "的宠物是一只名叫" + super.getName() + "的鸟，是否长着翅膀" + hasWings);
	}

}
