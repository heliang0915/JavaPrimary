package lession8.test2;

public class TestPet {

	public static void main(String[] args) {

		Animal1 c = new Cat1("С��", "blue");
		Animal1 d = new Dog1("���", "yellow");

		Kids k1 = new Kids("Tom", c);
		Kids k2 = new Kids("Emily", d);
		k1.myPetSounds();
		k2.myPetSounds();

		Animal1 b = new Bird1("����", true);
		Kids k3 = new Kids("Rose", b);
		k3.myPetSounds();

		// Tom�ĳ�����һֻ����С�׵�è���۾���ɫ��blue
		k1.myPetDisplay();
		k2.myPetDisplay();
		k3.myPetDisplay();

	}

}
