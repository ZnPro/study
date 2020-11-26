package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Won {
	
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
		
		if(money>0) {
			count=money/50000;
			namaji=money%50000;
			System.out.println("오만원권 "+count+"매");
			
			count=namaji/10000;
			namaji=namaji%10000;
			System.out.println("만원권 "+count+"매");
			
			count=namaji/1000;
			namaji=namaji%1000;
			System.out.println("천원권 "+count+"매");
			
			count=namaji/100;
			namaji=namaji%100;
			System.out.println("백원 "+count+"개");
			
			count=namaji/50;
			namaji=namaji%50;
			System.out.println("오십원 "+count+"개");
			
			count=namaji/10;
			namaji=namaji%10;
			System.out.println("십원 "+count+"개");
			
			count=namaji/1;
			namaji=namaji%1;
			System.out.println("일원 "+count+"개");
		}
		
		
		

	}

}
