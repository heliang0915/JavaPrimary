package lession8.test2;

public class Kids {
	private String name;
	private Animal1 pet;

	public Kids(String name, Animal1 pet) {
		this.name = name;
		this.pet = pet;
	}

	public void myPetSounds() {
		pet.Sounds();
	}

	public void myPetDisplay() {
		pet.display(name);
	}

}
