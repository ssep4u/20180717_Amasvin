package kr.hs.emirim.amasvin;

public class Coffee extends Drink {

	public Coffee(String name, int price) {
		super(name, price);
	}

	public Coffee(Coffee coffee) {
		super(coffee.name, coffee.price);
	}
}
