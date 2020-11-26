package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Center {

	public String getData() {
		InputStream s = System.in;
		InputStreamReader ir = new InputStreamReader(s);
		BufferedReader br = new BufferedReader(ir);

		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println("1");
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int result = 0;

		if (n1>n2) {
			System.out.println("n1이 n2보다 큼");
		
		}else {
			System.out.println("n2가 n1보다큼");
		}
		
		
		
		
		
	}
}
