package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame{
	public Ex01(){
		
		setSize(300,600);
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10, 10));
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		btn2.setSize(300,200);
		btn3.setSize(300,200);
		
		JPanel jp1 = new JPanel();
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		
		con.add(btn1, BorderLayout.NORTH);
		con.add(btn2, BorderLayout.CENTER);
		con.add(jp1, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
