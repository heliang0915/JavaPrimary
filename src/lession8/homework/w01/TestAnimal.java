package lession8.homework.w01;


public class TestAnimal {
	public static void main(String[] args) {
		Animal animal = new Bird("Tom", 2);
		Animal animal2 = new Fish("Rous", 3);
		animal.run();
		animal2.run();
	}
}
