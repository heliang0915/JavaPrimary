package lession5;

public class AirConditioner {
	// ÊôÐÔ
	private String name;
	private String brand;
	private String type;
	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// ÐÐÎª
	void cool() {
		temperature--;
	}

	void hot() {
		temperature += 7;
	}

}
