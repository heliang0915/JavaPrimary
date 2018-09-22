package lession3.test;


public class VariableScopeExample{
  public static void main(String args[]){
    int first=1;		//first的作用域从这里开始
    System.out.println("first="+first);
    int second=2;	//second的作用域从这里开始
    System.out.println("first="+first);
    System.out.println("second="+second);
    int third=3;		//third的作用域从这里开始
    System.out.println("first="+first);
    System.out.println("second="+second);
    System.out.println("third="+third);
    //3个变量的作用域到这里结束
  }
}