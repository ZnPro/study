package Star1;

class River {
	//규칙 1. 상태
	//final String name;//(변하지 않는 이름은 final붙임: 상수: 메모리 공간을 읽기 전용으로 변경)
	String name;
	int hp;
	int attack;
	
	//2. 초기화를 위한 생성자
	public River(String n, int h, int a) {
		name= n;
		hp= h;
		attack= a;
	}
	//3. 디폴트 생성자를 직접 만들어준다.(이유: 컴파일러가 안만들어주니까)
	public River() {}
	//4. 변수의 값을 변경하거나 확인하는 행위(메서드)가 필요
}
