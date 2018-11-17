package lession11;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestButton {
	public static void main(String[] args) {
		Frame fream = new Frame("我是标题");
		// FlowLayout fl = new FlowLayout();
		// FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		// FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 30, 40);
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 30, 40);
		fream.setLayout(fl);
		for (int i = 1; i <= 7; i++) {
			fream.add(new Button("BUTTON" + i));
		}

		fream.setLocation(100, 200);
		fream.setSize(300, 200);
		fream.setBackground(Color.gray);
		fream.setVisible(true);
		fream.setResizable(true);
	}
}
