package ch05;

class 지구인{
	String name="지구인";
}
class 한국인 extends 지구인{
	String name="한국인";
}
class 부산인 extends 한국인{
	String name="부산인";
}
public class Inherit02 {
	public static void main(String[] args) {
		//부산인 b= new 한국인();//부산인은 메모리에 안떠서 안됨.
		지구인 b= new 한국인();//heap(한국,지구인) ->포인터(지구인)
		
		//1. b는 한국인, 지구인이 메모리에 다 있기 때문에 다운캐스팅가능
		한국인 h= (한국인)b;//한국인h=b;b는 지구인 가리키고 h는 한국인을 가리키고잇음
		
		//2. 
		
		try {
			부산인 busan= (부산인)b;
		} catch (Exception e) {
			//개발자가 핸들링 하는 부분(로그파일)
			System.out.println("오류발생무시");
		}
		
		
	}
}
