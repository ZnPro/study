package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	public String getData() {
		InputStream in = System.in; // 아스키코드로 한 문자 받음
		InputStreamReader ir = new InputStreamReader(in); //문자를 한 문자 받음
		BufferedReader br = new BufferedReader(ir); // 문자를 문자열로 받음
		
		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println("괜찮아");
		}
		return "";
	}

}
