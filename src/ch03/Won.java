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
			System.out.println("������");
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");
		final int money = sc.nextInt();

		int count=0;
		int namaji=0;
		
		if(money>0) {
			count=money/50000;
			namaji=money%50000;
			System.out.println("�������� "+count+"��");
			
			count=namaji/10000;
			namaji=namaji%10000;
			System.out.println("������ "+count+"��");
			
			count=namaji/1000;
			namaji=namaji%1000;
			System.out.println("õ���� "+count+"��");
			
			count=namaji/100;
			namaji=namaji%100;
			System.out.println("��� "+count+"��");
			
			count=namaji/50;
			namaji=namaji%50;
			System.out.println("���ʿ� "+count+"��");
			
			count=namaji/10;
			namaji=namaji%10;
			System.out.println("�ʿ� "+count+"��");
			
			count=namaji/1;
			namaji=namaji%1;
			System.out.println("�Ͽ� "+count+"��");
		}
		
		
		

	}

}
