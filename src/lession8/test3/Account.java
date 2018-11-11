package lession8.test3;

public abstract class Account {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract double getLiXi();
}
