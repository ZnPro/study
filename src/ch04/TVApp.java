package ch04;

class TV{
	int size;
	String mf;
	public TV() {
		this(32, "LG");//this()는 자기 자신을 실행. 장점: 생성자 재활용
	}
	public TV(String mf) {
		this(32,mf);
	}
	public TV(int size, String mf) {
		this.size=size;
		this.	mf=mf;
		System.out.println(size+"인치 "+mf);
	}
}

public class TVApp {
	public static void main(String[] args) {
		new TV();
		new TV("삼성");
		new TV(65, "삼성");
	}

}
