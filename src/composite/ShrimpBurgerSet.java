package composite;

import lombok.Data;

@Data
public class ShrimpBurgerSet {
	private Burger burger;
	private Potato potato;
	private Coke coke;
	
	public ShrimpBurgerSet(){
		this(
				new ShrimpBurger(),
				new Potato(),
				new Coke()
				);
	}
	public ShrimpBurgerSet(Burger burger, Potato potato, Coke coke) {
		super();
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
}
