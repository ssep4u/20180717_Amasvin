package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class Drink {
	String name;
	int price;
	int[] ices = { 0, 50, 100, 150 };
	int ice;
	String[] cups = { "레귤러", "점보" };
	String cup;

	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
		ice = ices[2];
		cup = cups[0];
	}

	public Drink(Drink drink) {
		name = drink.name;
		price = drink.price;
		cup = drink.cup;
		ice = drink.ice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIce() {
		return ice;
	}

	public void setIce() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼음량을 선택하세요(1: 0%, 2: 50%, 3: 100%, 4: 150%) : ");
		int index = scanner.nextInt();
		this.ice = ices[index - 1];
	}

	public String getCup() {
		return cup;
	}

	public void setCup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("컵을 선택하세요(1: 레귤러, 2: 점보) : ");
		int index = scanner.nextInt();
		this.cup = cups[index - 1];
		if ((index - 1) == 1) {
			price += 500;
		}
	}

	@Override
	public String toString() {
		return name + ": " + price + "원";
	}

	public String toOrderString() {
		return toString() + "\t컵: " + cup + "\t얼음량: " + ice + "%";
	}
}
