package kr.hs.emirim.amasvin;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	ArrayList<Drink> menus;
	ArrayList<Drink> orderDrinks = new ArrayList<Drink>();
	public Order(ArrayList<Drink> menus) {
		this.menus = menus;
	}
	public boolean order() {
		System.out.println("몇 번을 주문하시겠습니까?(0: 끝)");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		
		if(index==0) return false;
		Drink newDrink;
		if(menus.get(index-1) instanceof BubbleTea) {
			newDrink = new BubbleTea((BubbleTea)menus.get(index-1));
		} else {
			newDrink = new Coffee((Coffee)menus.get(index-1));
		}
		newDrink.setCup();
		if(newDrink instanceof PearlSelectable) {
			((PearlSelectable)newDrink).setPearl();
		}
		newDrink.setIce();
		
		orderDrinks.add(newDrink);
		
		return true;
	}
	public int getSumPrice() {
		int sum = 0;
		for (Drink drink : orderDrinks) {
			sum+=drink.price;
		}
		return sum;
	}
	public void show() {
		for (Drink drink : orderDrinks) {
			System.out.println(drink.toOrderString());
		}
		System.out.println("총 금액: "+getSumPrice()+"원");
	}
	
	

}
