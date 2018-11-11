package lession3.keshang;

import org.junit.Test;
/**
 * 6°¢¥Ú”°Õº–Œ°£2  3
 * @author Administrator
 *
 */
public class Priangle {
	public static void main(String[] args) {
		Priangle pr = new Priangle();
		pr.printPriangle2();
		System.out.println("");
		pr.printPriangle3();
	}

	@Test
	public void printPriangle2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void printPriangle3() {
		for (int i =6; i >=1; i--) {
			for (int j =2*i-1; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
