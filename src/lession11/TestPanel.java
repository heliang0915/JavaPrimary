package lession11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestPanel {
	public static void main(String[] args) {
		Frame frame = new Frame("≤‚ ‘panel");
		frame.setLayout(null);
		Panel p = new Panel();
		p.setBackground(new Color(222, 12, 11));
		p.setBounds(50, 50, 100, 100);

		frame.add(p);
		frame.setBounds(100, 100, 200, 200);
		frame.setResizable(true);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
	}
}
