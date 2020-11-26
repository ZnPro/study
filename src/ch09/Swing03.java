package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

//class NorthPanel extends JPanel{
//	
//}
//
//class CenterPanel extends JPanel{
//	
//}
public class Swing03 extends JFrame {
	public Swing03() {
		//1. initObject();필요한 오브젝트를 메모리에 로딩
		//2. initSetting();세팅
		//3. initBatch();배치
		setSize(300, 300);
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		JButton Button = new JButton("Open");
		JButton Button_1 = new JButton("Read");
		JButton Button_2 = new JButton("Close");
		
		JPanel panel_1 = new JPanel();
		
		JLabel Label = new JLabel("Hello");
		JLabel Label_1 = new JLabel("Java");
		JLabel Label_2 = new JLabel("Love");
		
		Label.setBounds(92, 36, 57, 15);
		Label_1.setBounds(30, 144, 57, 15);
		Label_2.setBounds(189, 114, 57, 15);
		
		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		panel.add(Button);
		panel.add(Button_1);
		panel.add(Button_2);
		
		panel_1.setLayout(null);
		panel_1.add(Label);
		panel_1.add(Label_1);
		panel_1.add(Label_2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing03();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}