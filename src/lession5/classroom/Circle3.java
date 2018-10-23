package lession5.classroom;

/**
 * 教材51页练习。
 * @Title:  Circle3.java   
 * @Package lession5.classroom   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 计续本18 17何良     
 * @date:   2018年10月21日 下午9:49:44
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
	 * 计算面积
	 * 
	 * @return
	 */
	public double getArea() {
		return pi * radius * radius;
	}

	/**
	 * 计算周长
	 * 
	 * @return
	 */
	public double getPerimeter() {
		return 2 * pi * radius;
	}

}
