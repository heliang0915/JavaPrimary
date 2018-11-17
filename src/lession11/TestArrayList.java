package lession11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestArrayList {

	@Test
	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("JAVA");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
