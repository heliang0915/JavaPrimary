package lesssion10;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		String str = "test";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		register();
	}

	public static void register() {
		Scanner sc = new Scanner(System.in);
		String userName = inputUserName(sc);
		String pwd = inputPwd(sc);
		System.out.println("注册成功 用户名为" + userName + " 密码为:" + pwd);
	}

	public static String inputUserName(Scanner sc) {
		System.out.println("请输入用户名：");
		String userName = sc.nextLine();
		if (userName.length() < 3) {// 用户名小于3位 重新输入
			System.out.println("用户名小于3位 重新输入");
			inputUserName(sc);
		}
		return userName;
	}

	public static String inputPwd(Scanner sc) {
		System.out.println("请输入密码：");
		String pwd = sc.nextLine();
		if (pwd.length() < 6) {// 密码小于6位 重新输入
			System.out.println("密码小于6位 重新输入");
			inputPwd(sc);
		} else {
			conformPwd(sc, pwd);
		}

		return pwd;
	}

	public static void conformPwd(Scanner sc, String pwd) {
		System.out.println("请输入确认密码：");
		String cpwd = sc.nextLine();
		if (!cpwd.equals(pwd)) {// 确认密码和密码不匹配请重新输入
			System.out.println("确认密码和密码不匹配请重新输入");
			conformPwd(sc, pwd);
		}
	}

}
