package kr.hs.emirim.amasvin;

import java.util.ArrayList;

public class Amasvin {
	static ArrayList<Drink> menus = new ArrayList<Drink>();
	
	public static void main(String[] args) {
		//�޴� ��������
		initMenu();
		//�޴� �����ְ�
		showMenu();
		//�ֹ� ����
		Order order = new Order(menus);
		while(order.order()) {
			showMenu();
		}
		//�� ������ �����ؼ� ��������
		order.show();
		// +�� �ݾ����� �Ž����� �������
	}

	private static void showMenu() {
		int i = 0;
		for (Drink drink : menus) {
			System.out.println((++i)+". "+drink);
		}
	}

	private static void initMenu() {
		menus.add(new Coffee("�Ƹ޸�ī��", 1800));
		menus.add(new Coffee("ī���", 2800));
		menus.add(new Coffee("�ٴҶ� ��", 3000));
		
		menus.add(new BubbleTea("�������� ��ũƼ", 2900));
		menus.add(new BubbleTea("�ϵ����� ����Ƽ", 3500));
		menus.add(new BubbleTea("���ڸ� �����̵�", 3700));
	}

}
