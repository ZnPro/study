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
		System.out.print("���� 3�� �Է�>> ");

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int result = 0;

		if (n1>n2) {
			System.out.println("n1�� n2���� ŭ");
		
		}else {
			System.out.println("n2�� n1����ŭ");
		}
		
		
		
		
		
	}
}
