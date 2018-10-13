package lession4.test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//
//课堂练习：
//1、创建一维数组，存放学生的6科成绩，计算总分和平均分。
//2、请将”我” “爱” “北” “京”存入数组，然后正着和反着输出。
//3、要求输入一组英文字符串数组，让这个字符串数组中前面一个元素的最后一个字母和下一个元素的首位上的字母相等，并且每个元素的长度大于等于2且小于等于100。
//4、输入10个数，将不重复的数放入数组，输出数组元素。
public class Test3 {
  public static void test1() {
	  double [] ary= {98,92,98,96,88,89};
	  double sum=0;
	  double avg=0;
	  for(int i=0;i<ary.length;i++) {
		  	sum+=ary[i];
	  }
	  System.out.println(sum);
	  avg=sum/ary.length;
	  System.out.println("总分分为"+sum);
	  System.out.println("平均分为"+new BigDecimal(avg).setScale(2, RoundingMode.UP));
	  
  }
  
  public static void test2() {
	  String[] ary= {"我","爱","北","京"};
	  System.out.println(Arrays.toString(ary));
	  String [] temp=new String[ary.length];
	  System.out.println("ary.length-1:::"+(ary.length-1));
	  int len=ary.length-1;
	  for(int i=len;i>=0;i--) {
		  temp[len-i]=ary[i];
	  }
	  System.out.println(Arrays.toString(temp));
  }
  
  @SuppressWarnings("unchecked")
  public static void test4(){
	  System.out.println("请输入10个数");
	  Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	 
	  int []temp=new int [10];
	  Scanner sc=new Scanner(System.in);
	  int counter=0;
	  
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	  int num3=sc.nextInt();
	  int num4=sc.nextInt();
	  int num5=sc.nextInt();
	  int num6=sc.nextInt();
	  int num7=sc.nextInt();
	  int num8=sc.nextInt();
	  int num9=sc.nextInt();
	  int num10=sc.nextInt();
	  temp[0]=num1;
	  temp[1]=num2;
	  temp[2]=num3;
	  temp[3]=num4;
	  temp[4]=num5;
	  temp[5]=num6;
	  temp[6]=num7;
	  temp[7]=num8;
	  temp[8]=num9;
	  temp[9]=num10;
	  for(int i=0;i<temp.length;i++) {
		  int num=temp[i];
		  if(map.get(num)==null) {
			  map.put(num,num);
		  }
	  }
	  
	  int []ary=new int[map.size()];
	  
    for(Integer key : map.keySet()) {
	   ary[counter]=key;
	   counter++;
     }
	  
	  System.out.println(Arrays.toString(ary));
	  
  }
  
  public static void main(String[] args) {
      test1();
	  test2();
	  test4();
}
 
	
}
