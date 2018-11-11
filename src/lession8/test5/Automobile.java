package lession8.test5;

public abstract class Automobile {
	protected int wheels;
	protected String color;

	public Automobile(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
	}

	public abstract void output();

}
