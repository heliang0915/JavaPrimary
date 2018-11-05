package lession8.test5;

public class Trunk extends Automobile {
	private double LoadWeight;

	public Trunk(int wheels, String color, double loadWeight) {
		super(wheels, color);
		this.LoadWeight = loadWeight;
	}

	@Override
	public void output() {
		System.out.print("Trunk:\t" + wheels + "\t" + color);
	}

	public void outputLoadWeight() {
		System.out.print(" \t" + LoadWeight+" ถึ");
	}

	@Override
	public boolean equals(Object o) {
		 if(o instanceof Trunk) {
			 Trunk t=(Trunk) o;
			 if(t.LoadWeight==LoadWeight&&t.wheels==wheels&&t.color.equals(color)) {
				 return true;
			 }else {
				 return false;
			 }
		 }else {
			 return false;
		 }
		 
	}

}
