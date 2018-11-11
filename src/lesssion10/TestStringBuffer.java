package lesssion10;

import org.junit.Test;

public class TestStringBuffer {
	@Test
	public void testStringBuffer() {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("abcdefg");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println(sb2);
		String str = "def";
		StringBuffer sb3 = new StringBuffer(str);
		System.out.println(sb3);
		String str1 = sb3.toString();
		System.out.println(str1);

		System.out.println(sb3.append("xyz"));
		System.out.println(sb3.append(true));
		System.out.println(sb3.append('a'));

		StringBuffer sb4 = new StringBuffer();
		String user = "test";
		String pwd = "123";

		sb4.append("select * from userInfo where username=").append(user).append(" and pwd=").append(pwd);

		System.out.println(sb4);

		sb4.insert(2, true);
		System.out.println(sb4);

		char[] b = { 65, 66, 67, 68 };

		System.out.println(sb4.insert(2, b, 1, 3));

		System.out.println(sb1.deleteCharAt(2));
		System.out.println(sb1.delete(1, 2));
		System.out.println(sb1.reverse());
		sb1.setCharAt(1, 'z');
		System.out.println(sb1);

	}
}
