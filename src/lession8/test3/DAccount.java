package lession8.test3;

public class DAccount extends Account {

	private final double rate = 0.02;

	@Override
	public double getLiXi() {
		return super.getMoney() * rate;
	}

}
