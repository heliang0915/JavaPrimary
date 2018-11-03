package lession8.test2;

public class TestPet {

	public static void main(String[] args) {

		Animal1 c = new Cat1("小白", "blue");
		Animal1 d = new Dog1("大黄", "yellow");

		Kids k1 = new Kids("Tom", c);
		Kids k2 = new Kids("Emily", d);
		k1.myPetSounds();
		k2.myPetSounds();

		Animal1 b = new Bird1("开心", true);
		Kids k3 = new Kids("Rose", b);
		k3.myPetSounds();

		// Tom的宠物是一只名叫小白的猫，眼睛颜色是blue
		k1.myPetDisplay();
		k2.myPetDisplay();
		k3.myPetDisplay();

	}

}
