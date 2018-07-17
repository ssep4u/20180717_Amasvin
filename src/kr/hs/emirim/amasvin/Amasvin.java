package kr.hs.emirim.amasvin;

import java.util.ArrayList;

public class Amasvin {
	static ArrayList<Drink> menus = new ArrayList<Drink>();
	
	public static void main(String[] args) {
		//메뉴 생성하자
		initMenu();
		//메뉴 보여주고
		showMenu();
		//주문 받자
		Order order = new Order(menus);
		while(order.order()) {
			showMenu();
		}
		//다 끝나면 정리해서 보여주자
		order.show();
		// +낸 금액으로 거스름돈 계산하자
	}

	private static void showMenu() {
		int i = 0;
		for (Drink drink : menus) {
			System.out.println((++i)+". "+drink);
		}
	}

	private static void initMenu() {
		menus.add(new Coffee("아메리카노", 1800));
		menus.add(new Coffee("카페라떼", 2800));
		menus.add(new Coffee("바닐라 라떼", 3000));
		
		menus.add(new BubbleTea("오리지널 밀크티", 2900));
		menus.add(new BubbleTea("하동녹차 버블티", 3500));
		menus.add(new BubbleTea("레자몽 버블에이드", 3700));
	}

}
