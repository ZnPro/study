package review;

class 저장소{
	String data;
	
	String 다운로드() {
		data= "GTA5";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("괜찮아");
			e.printStackTrace();
		} // 1000=1초
		return data;
	}
}
//자바는 메서드를 함수의 매개변수로 전달할 수없음.
//자바는 메서드를 함수의 매개변수로 전달하고싶으면
//무조건 인터페이스에 함수를 담는다.
//인터페이스는 new할 수 없기 때문에 익명클래스로 넘긴다.
public class Ex122 {

	public static void main(String[] args) {
		저장소 s = new 저장소();
		String game = s.다운로드();
		
		System.out.println(game + "실행");
	}
}
