package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Won2 {
	
	public String getData() {
		InputStream in = System.in;
		InputStreamReader ir= new InputStreamReader(in);
		BufferedReader br=new BufferedReader(ir);
		
		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println("괜찮아");
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("금액을 입력하시오: ");
		final int money = sc.nextInt();

		int count=0;
		int namaji=0;
		
		int []arr = {50000, 10000, 1000, 100, 50, 10, 1};
		
		for (int i =0; i <7; i++) {
			count=money/arr[i];
			namaji=money%arr[i];
			System.out.println(arr[i]+"원권 "+count+"매");
		}
		
		
		
		

	}

}
