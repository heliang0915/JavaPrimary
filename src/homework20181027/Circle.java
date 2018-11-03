package homework20181027;
/**
 * 定义圆类
 * @Title:  Circle.java   
 * @Package homework20181027   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 计续本18 17何良     
 * @date:   Nov 1, 2018 8:36:55 PM
 */
public class Circle {
	private double radius;    //半径
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//圆的面积 PI*R^2
	public double getArea(){
		return Math.PI * radius * radius;
	}
	//周长 2*PI*R
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
}
