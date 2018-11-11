package lesssion10;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		register();
	}
	public static void register() {
		Scanner sc = new Scanner(System.in);
		String userName = inputUserName(sc);
		String pwd = inputPwd(sc);
		sc.close();
		System.out.println("ע��ɹ� �û���Ϊ" + userName + " ����Ϊ:" + pwd);
	}
	public static String inputUserName(Scanner sc) {
		System.out.println("�������û�����");
		String userName = sc.nextLine();
		if (userName.length() < 3) {// �û���С��3λ ��������
			System.out.println("�û���С��3λ ��������");
			inputUserName(sc);
		}
		return userName;
	}
	public static String inputPwd(Scanner sc) {
		System.out.println("���������룺");
		String pwd = sc.nextLine();
		if (pwd.length() < 6) {// ����С��6λ ��������
			System.out.println("����С��6λ ��������");
			inputPwd(sc);
		} else {
			conformPwd(sc, pwd);
		}
		return pwd;
	}
	public static void conformPwd(Scanner sc, String pwd) {
		System.out.println("������ȷ�����룺");
		String cpwd = sc.nextLine();
		if (!cpwd.equals(pwd)) {// ȷ����������벻ƥ������������
			System.out.println("ȷ����������벻ƥ������������");
			conformPwd(sc, pwd);
		}
	}
}
