package review;

/**
 * 
 * @author 김진호
 * static은 main이 시작하기 전에 메모리에 로딩된다.
 * 그 말은 static 데이터는 중복될 수없음. 단 한 번만 메모리에 로딩되기 때문!!
 * 두 개가 메모리에 뜰 수 없음. =>static 데이터는 공유될 수 있는 데이터
 * 
 * heap은 new할 때 메모리에 뜬다. 타이밍이 무조건 static보다 늦음.
 * 개발자가 원하는 만큼 메모리에 로딩할 수 있음.
 * 공유 데이터가 아니고 각 각이 데이터를 따로 가지고 있음.
 * 자동차 공장에서 소나타를 세 대를 찍어서 판매하면 3개의 소나타는 다른 소나타
 */
public class Ex07 {
	
	int num = 10;// 안뜸 new 해야 뜸(heap변수, 이면서 '필드', '프로퍼티')
	static int sum = 20;//main이 시작되기 전에 뜸
	
	public static void main(String[] args) {
	System.out.println(Ex07.sum);
	
	Ex07 e = new Ex07();
	System.out.println(e.num);
	}
}
