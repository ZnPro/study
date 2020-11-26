package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginScreen extends JFrame{
	//Context : 스토커 (어떤 대상에 대해 모든 정보를 알고 있는 것-heap정보)
	private JTextField tfUsername;
	private JButton btnLogin;
	private LoginScreen loginScreen = this;//new this 하면 안됨
	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("로그인");
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c= getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		
		initListener();
		
		setVisible(true);
	}
	//리스너 등록 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if(username.equals("ssar")) {
					new HomeScreen(loginScreen);//this. ~~로 창을 못 끄는 이유는 익명클래스이기 때문
					loginScreen.setVisible(false);
				}else {
					System.out.println("로그인 실패: 아이디를 다시 입력하세요");
				}
			}
		});
	}
	public JTextField getTfUsername() {
		return tfUsername;
	}
	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public LoginScreen getLoginScreen() {
		return loginScreen;
	}
	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}
}