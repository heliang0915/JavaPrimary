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
		Charset charset = Charset.forName("UTF-8"); // ָ������
		String str1 = new String(b, charset);
		System.out.println(str1);
		String str2 = new String(b, 1, 2); // ���ô�ƫ������
		System.out.println(str2);
		char[] ary = word.toCharArray();
		for (int i = 0; i < ary.length; i++) {
			char cha = ary[i];
			System.out.println(cha);
		}
		System.out.println(word.toCharArray());
		System.out.println(word.equals(word2));
		System.out.println(word.equalsIgnoreCase(word2)); // ���Դ�Сд�Ƚ�
		System.out.println(word.startsWith("he")); // �Ƿ���ָ�����ֿ�ͷ
		System.out.println(word.endsWith("ld")); // �Ƿ���ָ�����ֽ�β

		System.out.println(word.length());// ���ֵĳ���

		System.out.println(word.charAt(2)); // ָ�����������ַ�

		System.out.println(                                           word.indexOf("d")); // ��һ�γ��ָ��ַ�������λ��
		System.out.println(word.lastIndexOf("l"));// ���һ�γ��ָ��ַ���λ��

		System.out.println(word.substring(0, 8)); // ��ȡ����ֵΪ0��8 ������8���ַ�
		System.out.println(word.substring(3));// ��ȡ��3����β���ַ�
		System.out.println(word.toUpperCase()); // ���ַ�ת���ɴ�д
		System.out.println(word.toLowerCase()); // ������ת����Сд

		System.out.println(word.compareTo(word2));
		String reg = "[a-z]{10}";
		String str11 = "1sssssssss";

		System.out.println(str11.matches(reg));

	}
}
