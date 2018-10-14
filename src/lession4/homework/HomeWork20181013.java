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
 * @Description: java课后作业 作业1013
 * @author: 计续本18 17何良     
 * @date:   2018年10月14日 下午11:11:37
 */
public class HomeWork20181013 {
	/**
	 * 1、定义一个二维数组（int，n行n列，n自定），依次输入n*n个2位数，分别赋值给数组各元素。方阵输出数组元素，计算并输出对角元素之和
	 * @Title: test3   
	 * @Description:定义一个二维数组（int，n行n列，n自定），依次输入n*n个2位数，分别赋值给数组各元素。方阵输出数组元素，计算并输出对角元素之和
	 */
	public static void homeWorkOne() {
		System.out.println("请输入n*n数组方阵");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ary=new int[n][n];
		StringBuffer result=new StringBuffer();
		for(int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("请输入第"+(i+1)+"行,第"+(j+1)+"列数");
				ary[i][j]=sc.nextInt();
				result.append(ary[i][j]).append("  ");
			}
			result.append("\n");
		}
		int sum=ary[0][0]+ary[n-1][n-1];
		int sum2=ary[0][n-1]+ary[n-1][0];
		System.out.println("对角元素[0][0]-["+(n-1)+"]["+(n-1)+"]之和为："+sum);
		System.out.println("对角元素[0]["+(n-1)+"]-["+(n-1)+"][0]之和为："+sum2);
		System.out.println("输出二维方阵为:");
		System.out.println(result);
//		sc.close();
	}

	
	/**
	 * 2、输入10个数，将不重复的数放入数组，输出数组元素。
	 */
	public static void homeWorkTwo() {
		System.out.println("请输入10个数");
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
	 * 3、请编写程序，检查一组英文字符串数组是否符合给定的规则。规则是这个字符串数组中前面一个元素的最后一个字母和下一个元素的首位上的字母相等，并且每个元素的长度大于等于2且小于等于100。
	 * @Title: test5   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: ary  数组元素
	 * @return: boolean  数组元素是否符合规则    
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
				if(curStart==preEnd&&(cur.length()>=2&&cur.length()<=100)) { //相等
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
		System.out.println("数组"+Arrays.toString(str)+(flag?"":"不")+"符合规则");
	}
}
