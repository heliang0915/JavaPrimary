package lession11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPannelFrames extends Frame {
	private Panel p, p2, p3, p4;

	public MyPannelFrames(String title, int x, int y, int width, int height) {
		super(title);
		this.setLayout(null);
		p = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();

		p.setBounds(0, 0, width / 2, height / 2);
		p2.setBounds(0, height / 2, width / 2, height / 2);
		p3.setBounds(width / 2, 0, width / 2, height / 2);
		p4.setBounds(width / 2, height / 2, width / 2, height / 2);

		p.setBackground(Color.blue);
		p2.setBackground(Color.red);
		p3.setBackground(Color.green);
		p4.setBackground(Color.pink);

		this.add(p);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.setBounds(x, y, width, height);
		this.setVisible(true);
		this.setResizable(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}

		});

	}
}
