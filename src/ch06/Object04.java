package ch06;

class User2{
	private int id ;
	private String name;
	private  String password;
	
//	public String toString() {
//		return "안녕";
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
		//레퍼런스를 출력하면 object가 가지고 잇는건 자동 호출
		
		String s= "안녕";
		System.out.println(s.toString());
		}
}
