package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		int num=10;
		Integer num2=20;//class�ϱ� ���۷���. �ּ��̴�.
		
		String num3=num2.toString();//toString(): ��� ���ڸ� String���� ĳ���� �� ���
		System.out.println(num3);

		String num4=num+""; //�⺻�ڷ��� + String�� �ٿ��� ���ڸ� String���� ���
		
		String num5="10";
		int num6=Integer.parseInt(num5);//Integer.parseInt(): ���ڸ� ���ڷ�
		System.out.println(num6);
	}
}
