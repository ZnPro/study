package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex02 extends JFrame{
	public Ex02() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container con = getContentPane();
		//con.setLayout(new BorderLayout());
		
		//Container c = getContentPane();
		//JPanel jp = new JPanel();
		//jp.add(c);
		
//		JButton btn1 = new JButton("버튼1");
//		JButton btn2 = new JButton("버튼2");
//		con.add(new Button("버튼1"));
//		con.add(new Button("버튼2"));
		
		//con.add(btn1, BorderLayout.CENTER);
		//con.add(btn2, BorderLayout.SOUTH);
		
		
		
		con.setLayout(grid);
		con.add(new JLabel(" 이름"));
		con.add(new JTextField());
		con.add(new JLabel(" 학번"));
		con.add(new JTextField());
		con.add(new JLabel(" 학과"));
		con.add(new JTextField());
		con.add(new JLabel(" 과목"));
		con.add(new JTextField());
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
