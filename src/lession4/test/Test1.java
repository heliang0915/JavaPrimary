package lession4.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
 
/**
 * ��1��100���ܱ�3����������֮��
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
  
  
  //ʹ�÷������ط�ʽʵ�ּ�������ܳ���Բ�ܳ��ķ�����
  
  /**
   *  �����ܳ�
   * @param x ��
   * @param y ��
   * @return
   */
  public  double perimeter(double x,double y) {
	  return  (x+y)*2;
  }
  /**
   * Բ�ε��ܳ�
   * @param r �뾶
   * @return
   */
  public  double perimeter(double r) {
	  return  2*Math.PI*r;
	  
  }
  
  
  
  
  
  public static void main(String[] args) {
	  Test1 t=new Test1();
	  System.out.println(t.sushu(5));
	  System.out.println(t.sum());
	 
	  System.out.println("���ε��ܳ�Ϊ"+t.perimeter(10,12));
	  System.out.println("Բ�ε��ܳ�Ϊ"+new BigDecimal(t.perimeter(4)).setScale(2, RoundingMode.UP));
	  
}
}
