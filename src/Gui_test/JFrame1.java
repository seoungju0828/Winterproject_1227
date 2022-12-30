package Gui_test;

import javax.swing.*;

public class JFrame1 {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		JLabel lb1 = new JLabel();
		ImageIcon icon = new ImageIcon("Images/승주네 수산.jpg");
		lb1.setIcon(icon);
		frame.add(lb1);

		frame.setTitle("JFrame 연습 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200, 200);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
		
	}

}
