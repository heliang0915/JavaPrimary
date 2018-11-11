package lesssion10;

import java.nio.charset.Charset;

import org.junit.Test;

public class TestString {
	// public static void main(String[] args) {
	// TestString test=new TestString();
	//
	// }
	@Test
	public void test() {
		String word = "helloWorld";
		String word2 = "HelloWorld";
		byte b[] = { 65, 66, 67 };
		String str = new String(b);
		System.out.println(str);
		Charset charset = Charset.forName("UTF-8"); // 指定编码
		String str1 = new String(b, charset);
		System.out.println(str1);
		String str2 = new String(b, 1, 2); // 调用带偏移量的
		System.out.println(str2);
		char[] ary = word.toCharArray();
		for (int i = 0; i < ary.length; i++) {
			char cha = ary[i];
			System.out.println(cha);
		}
		System.out.println(word.toCharArray());
		System.out.println(word.equals(word2));
		System.out.println(word.equalsIgnoreCase(word2)); // 忽略大小写比较
		System.out.println(word.startsWith("he")); // 是否以指定文字开头
		System.out.println(word.endsWith("ld")); // 是否以指定文字结尾

		System.out.println(word.length());// 文字的长度

		System.out.println(word.charAt(2)); // 指定索引处的字符

		System.out.println(                                           word.indexOf("d")); // 第一次出现该字符的索引位置
		System.out.println(word.lastIndexOf("l"));// 最后一次出现该字符的位置

		System.out.println(word.substring(0, 8)); // 截取索引值为0至8 不包含8的字符
		System.out.println(word.substring(3));// 截取从3至结尾的字符
		System.out.println(word.toUpperCase()); // 将字符转换成大写
		System.out.println(word.toLowerCase()); // 将文字转换成小写

		System.out.println(word.compareTo(word2));
		String reg = "[a-z]{10}";
		String str11 = "1sssssssss";

		System.out.println(str11.matches(reg));

	}
}
