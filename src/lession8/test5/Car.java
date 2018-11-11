package lession8.test5;

public class Car extends Automobile {
	private int SeatingCapacity;

	public Car(int wheels, String color, int seatingCapacity) {
		super(wheels, color);
		this.SeatingCapacity = seatingCapacity;
	}

	@Override
	public void output() {
		System.out.print("Car:\t "+ wheels + "\t" + color);
	}

	public void outputSeatingCapacity() {
		System.out.print("\t" + SeatingCapacity+" »À");
	}
	
	@Override
	public boolean equals(Object o) {
		 if(o instanceof Car) {
			 Car car=(Car) o;
			 if(car.SeatingCapacity==SeatingCapacity&&car.wheels==wheels&&car.color.equals(color)) {
				 return true;
			 }else {
				 return false;
			 }
		 }else {
			 return false;
		 }
		 
	}
}
