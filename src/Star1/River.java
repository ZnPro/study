package Star1;

class River {
	//��Ģ 1. ����
	//final String name;//(������ �ʴ� �̸��� final����: ���: �޸� ������ �б� �������� ����)
	String name;
	int hp;
	int attack;
	
	//2. �ʱ�ȭ�� ���� ������
	public River(String n, int h, int a) {
		name= n;
		hp= h;
		attack= a;
	}
	//3. ����Ʈ �����ڸ� ���� ������ش�.(����: �����Ϸ��� �ȸ�����ִϱ�)
	public River() {}
	//4. ������ ���� �����ϰų� Ȯ���ϴ� ����(�޼���)�� �ʿ�
}
