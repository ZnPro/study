package ch04;


class User{
	private int id;
	private String name;
	private String phone;
	
	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public User() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

public class Array01 {

	public static void main(String[] args) {
		User[] users= new User[3];
		
		users[0] = new User(1,"ȫ�浿", "01033");
		users[1] = new User(2,"�̱浿", "01973");
		users[2] = new User(3,"�赿ȣ", "01563");
		
		System.out.println(users[2].getId());
		System.out.println(users[2].getName());
		System.out.println(users[2].getPhone());
	}

}
