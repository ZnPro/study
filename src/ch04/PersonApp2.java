package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		//Ctrl + 클래스 클릭(바로가기) Alt + 화살표(뒤로가기)
		//기본 생성자 = 클래스면에 ()있는거 = 생략 가능
		Person p1 = new Person("최승희", "의사", 45, '여', "A");
		Person p2 = new Person("이미녀", "골프 선수", 28, '여', "O");
		Person p3 = new Person("김미남", "교수", 47, '남', "AB");
		p1.preview();
		p2.preview();
		p3.preview();
	}

}
