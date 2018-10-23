package lession5.homework;
/**
 * 75页 3题
 * @Title:  Box.java   
 * @Package lession5.homework   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 计续本18 17何良     
 * @date:   2018年10月23日 下午9:15:29
 */
public class Box {
	private double w;
	private double l;
	private double h;

	public Box(double w, double l, double h) {
		this.w = w;
		this.l = l;
		this.h = h;
	}
	
	/**
	 * 立方体体积
	 * @Title: boxVolume   
	 * @Description: 计算立方体体积
	 * @throws
	 */
	public double boxVolume() {
		return w*l*h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

}
