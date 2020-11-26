package Star1;

class Marine extends StarUnit {
	//멤버변수: <필드>: heap변수: 전역변수: 속성: <프로퍼티>
	//모든 필드or프로퍼티는 private로 만든다. 마법x
	private String name;
	private int hp;
	private int attack;
	
	//Alt Shift S 밑에서 3번째
	public Marine(String name, int hp, int attack) {
		this.name = name; //this는 heap변수. 바로 위 String name을 받아서 위에 있는 name에 초기화
		this.hp = hp;
		this.attack = attack;
		//1. this는 heap변수. heap을 가리킨다.
		//this는 new가 된 heap 공간을 Binding 한다.
		//this는 class가 가진 변수가 아니라 heap이 가진 변수
	}
	public Marine() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}	
}
