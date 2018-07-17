package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class BubbleTea extends Drink implements PearlSelectable {
	String[] pearls= {"Ÿ�ǿ�ī ��","���� ��", "���� ��", "�˷ο� ��"};
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
		System.out.println("���� �����ϼ���(1: Ÿ�ǿ�ī ��, 2: ���� ��, 3: ���� ��, 4: �˷ο� ��) : ");
		int index = scanner.nextInt();
		this.pearl = pearls[index-1];
	}

	@Override
	public String getPearl() {
		return pearl;
	}

	@Override
	public String toOrderString() {
		return super.toOrderString()+"\t��: "+pearl;
	}
	

}
