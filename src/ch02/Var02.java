package ch02;

public class Var02 {

	public static void main(String[] args) {
		int num = 10; //4Byte -32bit -42��9õ(-20��~+20��)
		long num2 = 100; //8Byte
		
		char s ='��'; //�ּ�2Byte
		
		double d = 7.5; //8Byte -42��9õ + �Ҽ��� ����

		boolean b = true; //1bit
		
		num = (int)d; //7 ����� ����ȯ(�ٿ�ĳ����-�ڷ� ����)
		num2 = num; //10 ������ ����ȯ<��ĳ����)
		num = (int)num2; //10����� ����ȯ(�ٿ�ĳ����)
	}
}
