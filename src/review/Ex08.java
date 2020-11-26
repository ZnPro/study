package review;

public class Ex08 {
	void add(int n1, int n2) {
		//void는 return이 없다. add는 변수이름, ()는 함수라는 뜻
		//int n1, int n2는 매개변수(arguments)
		System.out.println(n1+n2);
	}
	
	int minus(int n1, int n2) {
		return n1-n2; //함수를 호출한 문장의 값이 n1-n2로 변경
	}
	public static void main(String[] args) {
		Ex08 e = new Ex08();
		e.add(3, 6); //함수의 호출(15번 라인에서 7번 라인 점프 후 다시 15번으로 돌아옴)
		//3과 6을 인수라고 부름.
		int result = e.minus(10, 5); //이 값이 5가 됨. int result = 5;
		System.out.println(result);
		
	}
}
