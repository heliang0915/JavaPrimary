package homework20181027;
/**
 * ����Բ��
 * @Title:  Circle.java   
 * @Package homework20181027   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ������18 17����     
 * @date:   Nov 1, 2018 8:36:55 PM
 */
public class Circle {
	private double radius;    //�뾶
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Բ����� PI*R^2
	public double getArea(){
		return Math.PI * radius * radius;
	}
	//�ܳ� 2*PI*R
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
}
