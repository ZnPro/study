package composite;

public class Bigburger extends Burger{
	
	public Bigburger() {
		this(2000, "�����"	);
	}
	public Bigburger(int price, String disc) {
		super(price, disc);
	}
}
