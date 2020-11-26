package ch03;

public class For01 {

	public static void main(String[] args) {
		//stack이 반복
		//초기값 i=1, <-시작전 1번만 호출
		//조건식 i가5보다 작을때까지 반복 후 종료될때마다 i가 1씩 증가
		
		//첫번째 루프: 초기값 설정 및 조건 확인
		//두번째 루프~ : i값 변경 후 조건 확인~
		for(int i=1; i<5; i++) { //스택에 비하면 i=1은 전역변수
			System.out.println("숫자: "+i);
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("숫자: "+i);
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i =i+2) {
			System.out.println("숫자: "+i);
		}
		System.out.println();
		
		//0~100 중 3의 배수만 출력
		for (int i = 3; i <= 100; i=i+3) {
			System.out.println("숫자: "+i);
		}
	}

}
