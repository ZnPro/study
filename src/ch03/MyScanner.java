package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	public String getData() {
		InputStream in = System.in; // �ƽ�Ű�ڵ�� �� ���� ����
		InputStreamReader ir = new InputStreamReader(in); //���ڸ� �� ���� ����
		BufferedReader br = new BufferedReader(ir); // ���ڸ� ���ڿ��� ����
		
		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println("������");
		}
		return "";
	}

}
