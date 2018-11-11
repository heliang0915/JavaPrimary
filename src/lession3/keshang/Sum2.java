package lession3.keshang;

/**
 * 7、求1到100不能被3整除的整数之和。
 * @author Administrator
 *
 */
public class Sum2 {
	public static void main(String[] args) {
		Sum2 su=new Sum2();
		su.sum2();
	}

	public void sum2() {
		int sum = 0;
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 100; i++) {
			if (i % 3 != 0) { // 不能被3整除
				sum += i;
				sb.append(" ").append(i);
				
			}
		}
		System.out.println("不能被三整除的整数有:"+sb);
		System.out.println("不能被3整除的数字之和为" + sum);
	}
}
