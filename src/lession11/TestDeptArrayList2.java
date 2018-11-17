package lession11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDeptArrayList2 {
	@Test
	public void testList() {
		List<Department> list = new ArrayList<Department>();

		list.add(new Department("10", "产品部门", "北京"));
		list.add(new Department("20", "技术部门", "上海"));
		list.add(new Department("30", "销售部门", "广州"));

		System.out.println("list个数为" + list.size());
		System.out.println("是否为空:" + list.isEmpty());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("---------------华丽的分割线----------------");
		list.remove(new Department("10", "产品部门", "北京"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
