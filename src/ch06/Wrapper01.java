package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		int num=10;
		Integer num2=20;//class니까 레퍼런스. 주소이다.
		
		String num3=num2.toString();//toString(): 모든 문자를 String으로 캐스팅 후 출력
		System.out.println(num3);

		String num4=num+""; //기본자료형 + String을 붙여서 숫자를 String으로 출력
		
		String num5="10";
		int num6=Integer.parseInt(num5);//Integer.parseInt(): 문자를 숫자로
		System.out.println(num6);
	}
}
