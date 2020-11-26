package ch02;

public class Var02 {

	public static void main(String[] args) {
		int num = 10; //4Byte -32bit -42억9천(-20억~+20억)
		long num2 = 100; //8Byte
		
		char s ='가'; //최소2Byte
		
		double d = 7.5; //8Byte -42억9천 + 소수점 이하

		boolean b = true; //1bit
		
		num = (int)d; //7 명시적 형변환(다움캐스팅-자료 유실)
		num2 = num; //10 묵시적 형변환<업캐스팅)
		num = (int)num2; //10명시적 형변환(다운캐스팅)
	}
}
