package ch10;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
	}

	public static void main(String[] args) {
		
	}
}
