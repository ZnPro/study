package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		//daemon process(process:�޸𸮿� �����ϰ� �ִ� ���)
		// ��� ���� process - ��ǥ������ ������(�����Ҷ� �ƴϸ� �Ȳ���+)
		int check=0;
		while(check>=0) {
			int num= sc.nextInt();
			System.out.println("���� ��: "+num);
			
			check=num;
//			if(num<0) {
//				break;
//			}
		}

	}

}