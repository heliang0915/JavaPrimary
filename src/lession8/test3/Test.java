package lession8.test3;

public class Test {

	public static void main(String[] args) {
		Account acc = new DAccount();
		Account acc2 = new CAccount();
		acc.setMoney(200);
		acc2.setMoney(200);
		System.out.println(acc.getLiXi());
		System.out.println(acc2.getLiXi());

	}

}
