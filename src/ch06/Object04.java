package ch06;

class User2{
	private int id ;
	private String name;
	private  String password;
	
//	public String toString() {
//		return "�ȳ�";
//	}
	

	public User2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
		
	}

	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
public class Object04{
	
	public static void main(String[] args) {
		User2 user= new User2(1,"ssar", "1234");
		System.out.println(user); 
		//���۷����� ����ϸ� object�� ������ �մ°� �ڵ� ȣ��
		
		String s= "�ȳ�";
		System.out.println(s.toString());
		}
}
