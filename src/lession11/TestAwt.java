package lession11;

import java.awt.Color;
import java.awt.Frame;

public class TestAwt {
	public static void main(String[] args) {
		Frame fream = new Frame("我是标题");

		fream.setLocation(100, 200);
		fream.setSize(300, 100);
		fream.setBackground(Color.gray);
		fream.setVisible(true);
		fream.setResizable(true);

	}

}
