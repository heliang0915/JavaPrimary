package lession8.test3;

public class CAccount extends Account {

	private final double rate = 0.01;

	@Override
	public double getLiXi() {
		return super.getMoney() * rate;
	}

}
