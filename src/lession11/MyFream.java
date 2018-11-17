package lession11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFream extends Frame {
	private static final long serialVersionUID = -7805534395216452529L;
	public static int no = 0;

	public MyFream(int x, int y, int width, int height, Color bgColor) {
		super("窗口标题" + no);
		Frame frame = new Frame();
		frame.setBounds(x, y, width, height);
		frame.setBackground(bgColor);
		frame.setResizable(true);
		frame.setVisible(true);
		// 关闭临时隐藏
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
			}
		});
	}
}
