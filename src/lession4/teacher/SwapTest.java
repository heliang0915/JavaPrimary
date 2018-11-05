package lession4.teacher;
public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;
		String str1 = "abc";
		String str2 = "def";
		swap(a, b);
		swap(str1, str2);
		System.out.println(a + "\t" + b);
		System.out.println(str1 + "\t" + str2);
	}

	private static void swap(String str1, String str2) {
		// TODO Auto-generated method stub
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
	}

}
