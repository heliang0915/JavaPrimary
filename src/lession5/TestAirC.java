package lession5;

public class TestAirC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirConditioner kt = new AirConditioner();
		// kt.name = "����360";
		// kt.brand = "����";
		// kt.type = "1.5ƥ";
		// kt.temperature = 20;
		kt.setName("����360");
		kt.setBrand("����");
		kt.setType("1.5ƥ");
		kt.setTemperature(20);

		kt.cool();
		System.out.println("��ǰ�¶�Ϊ��" + kt.getTemperature());

		kt.hot();
		System.out.println("��ǰ�¶�Ϊ��" + kt.getTemperature());
		System.out.println("�յ�Ʒ��Ϊ" + kt.getBrand() + ",����Ϊ��" + kt.getType());
	}

}