package ch04;

class President{
	
	private static President instance = new President();
	
	public static President getInstance() {
		return instance;
	}
	private President() {
		
	}
}

public class SingtoneApp {

	public static void main(String[] args) {
		President p = President.getInstance();
		//new는 못하지만 이미 띄워진 공간은 참조 가능
	}

}
