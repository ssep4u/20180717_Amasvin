package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class BubbleTea extends Drink implements PearlSelectable {
	String[] pearls= {"타피오카 펄","코코 펄", "젤리 펄", "알로에 펄"};
	String pearl;
	
	public BubbleTea(String name, int price) {
		super(name, price);
		pearl = pearls[0];
	}
	
	public BubbleTea(BubbleTea bubbleTea) {
		super(bubbleTea);
		pearl = bubbleTea.pearl;
	}

	@Override
	public void setPearl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("펄을 선택하세요(1: 타피오카 펄, 2: 코코 펄, 3: 젤리 펄, 4: 알로에 펄) : ");
		int index = scanner.nextInt();
		this.pearl = pearls[index-1];
	}

	@Override
	public String getPearl() {
		return pearl;
	}

	@Override
	public String toOrderString() {
		return super.toOrderString()+"\t펄: "+pearl;
	}
}
