package Gui_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jFrame2 extends JFrame implements ActionListener{
	
	ImageIcon icon = new ImageIcon("Images//승주네 수산.jpg");
	JLabel lb1 = new JLabel(icon, JLabel.CENTER);
	
	JButton btn1 = new JButton("NCT 127");
	JButton btn2 = new JButton("NCT dream");
	JButton btn3 = new JButton("Red Velvet");
	
	public jFrame2() {
		JPanel pan = new JPanel();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		pan.add(btn1); pan.add(btn2); pan.add(btn3);
		add(pan, "North");
		add(lb1);
		
		setTitle("Jframe 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		new jFrame2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btnSource = (JButton) e.getSource();
		
		if (btnSource == btn1) {
			icon = new ImageIcon("Images/NCT 127.jpg");
		}else if (btnSource == btn2) {
			icon = new ImageIcon("Images/NCT dream.jpg");
		}else {
			icon = new ImageIcon("Images/Redvelvet.jpg");
		}
		lb1.setIcon(icon);
	}
	
}
