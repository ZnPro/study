package ch02;

//Java는 .class파일을 실행하면 static 부분을 메모리에 로드한다.(static공간)
//static공간에 있는 main()함수를 찾아서 호출하고
//이때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
//main에 stack 종료되면 프로그램 종료
//static: pro실행전~끝까지 준비되는 애들. 적으면 좋음(많으면 과부화)
//heap: 유동적으로 in/out하는 애들.
//1.class file loading 2. static 찾기 3. main() 호출(함수 내부를 stack. 함수가 종료될때까지)
public class Var01 {
	public static void main(String args[]){
		//Code 부분
		System.out.println("첫번째");
		System.out.println("두번째");
	}//end of main
}
