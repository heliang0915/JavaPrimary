package homework20181027;

import java.math.BigDecimal;

public class TestCylinder {

	public static void main(String[] args) {
		Circle circle = new Circle();		 //����Բ����
		circle.setRadius(3);			 	 //����Բ�뾶Ϊ3
		Cylinder cylinder = new Cylinder();  //����Բ�������
		cylinder.setCircle(circle);			 //����Բ�����Բ
		cylinder.setHeight(4);			     //����Բ����ĸ�
		
		double superficialArea=cylinder.getSuperficialArea();
		double volume=cylinder.getVolume();
		
		BigDecimal bigSuperficialArea=new BigDecimal(superficialArea);
		bigSuperficialArea=bigSuperficialArea.setScale(2, BigDecimal.ROUND_HALF_UP);//��������
		
		BigDecimal bigVolume=new BigDecimal(volume);
		bigVolume=bigVolume.setScale(2, BigDecimal.ROUND_HALF_UP);//��������
		
		System.out.println("Բ�������="+bigSuperficialArea);
		System.out.println("Բ�����="+bigVolume);
	}
	
}
