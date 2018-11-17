package lession11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDeptArrayList2 {
	@Test
	public void testList() {
		List<Department> list = new ArrayList<Department>();

		list.add(new Department("10", "��Ʒ����", "����"));
		list.add(new Department("20", "��������", "�Ϻ�"));
		list.add(new Department("30", "���۲���", "����"));

		System.out.println("list����Ϊ" + list.size());
		System.out.println("�Ƿ�Ϊ��:" + list.isEmpty());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("---------------�����ķָ���----------------");
		list.remove(new Department("10", "��Ʒ����", "����"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
