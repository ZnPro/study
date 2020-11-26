package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		//daemon process(process:메모리에 상주하고 있는 모두)
		// 계속 도는 process - 대표적으로 웹서버(점검할때 아니면 안꺼짐+)
		int check=0;
		while(check>=0) {
			int num= sc.nextInt();
			System.out.println("받은 값: "+num);
			
			check=num;
//			if(num<0) {
//				break;
//			}
		}

	}

}
