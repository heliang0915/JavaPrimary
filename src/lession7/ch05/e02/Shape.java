package lession7.ch05.e02;


//子类构造过程



public class Shape {
	private String name;
	private String fillColor;
	private String borderColor;
	public Shape() {
		System.out.println("Construct Shape");
	}
	public Shape(String name, String fillColor, String borderColor) {
		this.name = name;
		this.fillColor = fillColor;
		this.borderColor = borderColor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	public void draw(){
		String str = "Draw  " + name;
		str += " with fillColor: " + fillColor;
		str += " and borderColor: " + borderColor;
		System.out.println(str);
	}

}
