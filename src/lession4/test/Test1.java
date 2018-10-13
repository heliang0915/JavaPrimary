package lession4.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
 
/**
 * 求1到100不能被3整除的整数之和
 * @return
 */
  public int sum() {
	  int total=0;
	  
	  for(int i=1;i<=100;i++) {
		  if(i%3!=0) {
			  total+=i;  
		  }
	  }
	  
	  return total;
  }
  
  
  public boolean  sushu(int num) {
	 if(num<=1) {
		 return false;
	 }
	 for(int i=2;i<num-1;i++) {
		if(num%i==0) {
			return false;
		}
	 }
	 
	 return true;
	  
  }
  
  
  //使用方法重载方式实现计算矩形周长和圆周长的方法。
  
  /**
   *  矩形周长
   * @param x 长
   * @param y 宽
   * @return
   */
  public  double perimeter(double x,double y) {
	  return  (x+y)*2;
  }
  /**
   * 圆形的周长
   * @param r 半径
   * @return
   */
  public  double perimeter(double r) {
	  return  2*Math.PI*r;
	  
  }
  
  
  
  
  
  public static void main(String[] args) {
	  Test1 t=new Test1();
	  System.out.println(t.sushu(5));
	  System.out.println(t.sum());
	 
	  System.out.println("矩形的周长为"+t.perimeter(10,12));
	  System.out.println("圆形的周长为"+new BigDecimal(t.perimeter(4)).setScale(2, RoundingMode.UP));
	  
}
}
