package JavaMyStudy;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		String[] hands = {"グー","チョキ","パー"};
//		Random r = new Random();
//		for(int i=0; i<5; i++) {
//			String hand = hands[r.nextInt(3)];
//			System.out.println(hand);
//		}
		
		int[] dice = {1, 2, 3, 4, 5, 6};
		Random d = new Random();
		int diceNumber = dice[d.nextInt(6)];
		System.out.println(diceNumber);
		
	}

}
