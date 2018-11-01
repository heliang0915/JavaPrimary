package homework20181027;

/**
 * 圆柱体类
 * 
 * @Title: Cylinder.java
 * @Package homework20181027
 * @Description: TODO(圆柱体类)
 * @author: 计续本18 17何良
 * @date: Nov 1, 2018 8:37:13 PM
 */
public class Cylinder {
	private Circle circle;// 圆类对象属性
	private double height; // 圆柱体的高

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 圆柱的表面积=侧面积+两个底面积=2πrh+2πr^2
	public double getSuperficialArea() {
		// 圆的周长*高+2倍圆的面积
		return this.circle.getPerimeter() * this.height + 2 * circle.getArea();
	}

	// 体积=地面积x高 πr^2×h
	public double getVolume() {
		// 圆的面积*高
		return this.circle.getArea() * this.height;
	}

}
