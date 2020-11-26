package ch04;

class Job{
	String getName() {
		return "";
	}
}

class Police extends Job{
	String name="°æÂû";

	public Police(String name) {
		super();
		this.name = name;
	}
	public Police() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Doctor extends Job{
	String name="ÀÇ»ç";

	public Doctor(String name) {
		super();
		this.name = name;
	}
	public Doctor() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Array02 {
	
	public static void main(String[] args) {
		Job[] j= new Job[2];
		
		j[0] = new Police("°æÂû");
		j[1] = new Doctor("ÀÇ»ç");
		//Police p= new Police("°æÂû");
		//Doctor d= new Doctor("ÀÇ»ç");
		
		System.out.println(j[0].getName());
		System.out.println(j[1].getName());
	}
}
