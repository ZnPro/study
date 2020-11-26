package ch06;

public class Object02{
	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str.hashCode());
		
		String str2= "홍길동";
		System.out.println(str2.hashCode());
		
		str="임꺽정";
		System.out.println(str.hashCode());
		//임의의 길이의 데이터를 고정된 길이의 데이터로매핑하는 함수
		//아주 가끔 해시 충돌이 일어남
		//복호화가 안됨
		//원본증명이 됨(전자 서명의 용도로 씀)
		//String a = new String("문자"); heap 저장
		//String s="안녕"; heap안에 있는 String Constant Pool에 저장
		}
}
