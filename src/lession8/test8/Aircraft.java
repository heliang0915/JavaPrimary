package lession8.test8;

import lession8.test8.inter.Flyable;

public class Aircraft implements Flyable {

	@Override
	public void fly() {
			System.out.println("我是飞机，我也会飞...");
	}

}
