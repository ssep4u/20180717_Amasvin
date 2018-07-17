package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class BubbleTea extends Drink implements PearlSelectable {
	String[] pearls= {"Å¸ÇÇ¿ÀÄ« ÆŞ","ÄÚÄÚ ÆŞ", "Á©¸® ÆŞ", "¾Ë·Î¿¡ ÆŞ"};
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
		System.out.println("ÆŞÀ» ¼±ÅÃÇÏ¼¼¿ä(1: Å¸ÇÇ¿ÀÄ« ÆŞ, 2: ÄÚÄÚ ÆŞ, 3: Á©¸® ÆŞ, 4: ¾Ë·Î¿¡ ÆŞ) : ");
		int index = scanner.nextInt();
		this.pearl = pearls[index-1];
	}

	@Override
	public String getPearl() {
		return pearl;
	}

	@Override
	public String toOrderString() {
		return super.toOrderString()+"\tÆŞ: "+pearl;
	}
	

}
