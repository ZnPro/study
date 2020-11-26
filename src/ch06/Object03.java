package ch06;

public class Object03{
	public static void main(String[] args) {
		String str1="홍길동";
		String str2="홍길동";
		
		int num=10;
		//==:최초 엑세스한 메모리 공간의 내용을 비교함.
		System.out.println(str1==str2);
		
		//String의 Hash함수는 오버라이딩 되서
		//같은 문자열이면 같은 해쉬를 뽑아낸다.
		//실제로는 다른 주소
		String str3="임꺽정"; //constant pool
		String str4=new String("임꺽정");// heap
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		//equals는 ==으로 먼저 비교해서 같으면 true
		//==으로 비교했는데 false가 나오면 최종목적지 값을 비교
		//총 2번을 비교 해줌
		//일반적인 모든것은 ==으로 비교하고 문자열은 equals로 비교
		System.out.println(str3.equals(str4));
		}
}
