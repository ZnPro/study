package Star1;

class Marine extends StarUnit {
	//�������: <�ʵ�>: heap����: ��������: �Ӽ�: <������Ƽ>
	//��� �ʵ�or������Ƽ�� private�� �����. ����x
	private String name;
	private int hp;
	private int attack;
	
	//Alt Shift S �ؿ��� 3��°
	public Marine(String name, int hp, int attack) {
		this.name = name; //this�� heap����. �ٷ� �� String name�� �޾Ƽ� ���� �ִ� name�� �ʱ�ȭ
		this.hp = hp;
		this.attack = attack;
		//1. this�� heap����. heap�� ����Ų��.
		//this�� new�� �� heap ������ Binding �Ѵ�.
		//this�� class�� ���� ������ �ƴ϶� heap�� ���� ����
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
