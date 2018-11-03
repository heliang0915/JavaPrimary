 package lession4.homework;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @Title:  HomeWork20181013.java   
 * @Package lession4.homework   
 * @Description: java�κ���ҵ ��ҵ1013
 * @author: ������18 17����     
 * @date:   2018��10��14�� ����11:11:37
 */
public class HomeWork20181013 {
	/**
	 * 1������һ����ά���飨int��n��n�У�n�Զ�������������n*n��2λ�����ֱ�ֵ�������Ԫ�ء������������Ԫ�أ����㲢����Խ�Ԫ��֮��
	 * @Title: test3   
	 * @Description:����һ����ά���飨int��n��n�У�n�Զ�������������n*n��2λ�����ֱ�ֵ�������Ԫ�ء������������Ԫ�أ����㲢����Խ�Ԫ��֮��
	 */
	public static void homeWorkOne() {
		System.out.println("������n*n���鷽��");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ary=new int[n][n];
		StringBuffer result=new StringBuffer();
		for(int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("�������"+(i+1)+"��,��"+(j+1)+"����");
				ary[i][j]=sc.nextInt();
				result.append(ary[i][j]).append("  ");
			}
			result.append("\n");
		}
		int sum=ary[0][0]+ary[n-1][n-1];
		int sum2=ary[0][n-1]+ary[n-1][0];
		System.out.println("�Խ�Ԫ��[0][0]-["+(n-1)+"]["+(n-1)+"]֮��Ϊ��"+sum);
		System.out.println("�Խ�Ԫ��[0]["+(n-1)+"]-["+(n-1)+"][0]֮��Ϊ��"+sum2);
		System.out.println("�����ά����Ϊ:");
		System.out.println(result);
//		sc.close();
	}

	
	/**
	 * 2������10�����������ظ������������飬�������Ԫ�ء�
	 */
	public static void homeWorkTwo() {
		System.out.println("������10����");
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int size=10;
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			if (map.get(num) == null) {
				map.put(num, num);
			}
		}
		int[] ary = new int[map.size()];
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()) {
			ary[counter] = it.next();
			counter++;
		}
		System.out.println(Arrays.toString(ary));
		sc.close();
	}
	
	 
	/**
	 * 3�����д���򣬼��һ��Ӣ���ַ��������Ƿ���ϸ����Ĺ��򡣹���������ַ���������ǰ��һ��Ԫ�ص����һ����ĸ����һ��Ԫ�ص���λ�ϵ���ĸ��ȣ�����ÿ��Ԫ�صĳ��ȴ��ڵ���2��С�ڵ���100��
	 * @Title: test5   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: ary  ����Ԫ��
	 * @return: boolean  ����Ԫ���Ƿ���Ϲ���    
	 */
	public static boolean homeWorkThree(String[] ary) {
		StringBuffer sb=new StringBuffer();
		String pre="";
		String cur="";
		for(int i=0;i<ary.length;i++) {
			cur=ary[i];
			char curStart=cur.charAt(0);
			if(pre!=null&&!pre.equals("")) {
				char preEnd=pre.charAt(pre.length()-1);
				if(curStart==preEnd&&(cur.length()>=2&&cur.length()<=100)) { //���
					sb.append(1);
				}else {
					sb.append(0);
				}
			}
			pre=cur;
		}
		return sb.indexOf("0")>-1?false:true;
	}
	public static void main(String[] args) {
		homeWorkOne();
		homeWorkTwo();
		String[] str=new String[]{"1a","a2b","b3c","caa"};
		boolean flag=homeWorkThree(str);
		System.out.println("����"+Arrays.toString(str)+(flag?"":"��")+"���Ϲ���");
	}
}
