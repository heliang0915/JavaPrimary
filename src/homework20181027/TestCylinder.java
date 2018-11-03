package homework20181027;

import java.math.BigDecimal;

public class TestCylinder {

	public static void main(String[] args) {
		Circle circle = new Circle();		 //定义圆对象
		circle.setRadius(3);			 	 //设置圆半径为3
		Cylinder cylinder = new Cylinder();  //定义圆柱体对象
		cylinder.setCircle(circle);			 //设置圆柱体的圆
		cylinder.setHeight(4);			     //设置圆柱体的高
		
		double superficialArea=cylinder.getSuperficialArea();
		double volume=cylinder.getVolume();
		
		BigDecimal bigSuperficialArea=new BigDecimal(superficialArea);
		bigSuperficialArea=bigSuperficialArea.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入
		
		BigDecimal bigVolume=new BigDecimal(volume);
		bigVolume=bigVolume.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入
		
		System.out.println("圆柱表面积="+bigSuperficialArea);
		System.out.println("圆柱体积="+bigVolume);
	}
	
}
