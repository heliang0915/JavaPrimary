package lession5.classroom;

/**
 * �̲�51ҳ��ϰ��
 * @Title:  Circle3.java   
 * @Package lession5.classroom   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ������18 17����     
 * @date:   2018��10��21�� ����9:49:44
 */

public class Circle3 {
	private double radius;
	private double pi = 3.14;


	public Circle3() {
		
	}
	
	public Circle3(double radius) {
		this.radius=radius;
	}

	/**
	 * �������
	 * 
	 * @return
	 */
	public double getArea() {
		return pi * radius * radius;
	}

	/**
	 * �����ܳ�
	 * 
	 * @return
	 */
	public double getPerimeter() {
		return 2 * pi * radius;
	}

}
