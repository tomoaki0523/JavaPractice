package Javastudy_1;

import java.util.Random;
import java.util.Scanner;

public class java_janken_test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ	
		
//		勝ち負けの初期値
		int win = 0;
		int lose = 0;
//		第N試合の初期値
		int battle = 1;
		System.out.println("じゃんけんをします。先に３回勝った方の勝ちです");
//		条件（ここがなぜ&&なのか確認したい）
		while(win < 3 && lose < 3) {
			System.out.println("");
			System.out.println("-------------------------第" + battle + "回戦-------------------------");
			System.out.print("グーなら：１　チョキなら：２　パーなら：３　を入力してください。▶");
			Scanner scan =new Scanner(System.in);
			int yourHand =scan.nextInt();
			
//			相手、グーなら１、チョキなら２、パーなら３とする
			int[] num= {1, 2, 3};
			Random i = new Random();
			int cpHand = num[i.nextInt(3)];
//			System.out.println(cpHand);
			
//			自分：グー　相手：チョキ
			if(yourHand ==1 && cpHand ==2) {    
				System.out.println("《結果》あなた：グー" + "　 " + "CP：チョキ《あなたの勝ち》");
				win++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：チョキ　相手：パー
			}else if(yourHand == 2 && cpHand ==3) {
				System.out.println("《結果》あなた：チョキ" + " 　" + "CP：パー《あなたの勝ち》");
				win++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：パー　相手：グー
			}else if(yourHand == 3 && cpHand ==1) {
				System.out.println("《結果》あなた：パー" + "　 " + "CP：グー《あなたの勝ち》");
				win++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：グー　相手：パー
			}else if(yourHand ==1 && cpHand ==3) {
				System.out.println("《結果》あなた：グー" + "　 " + "CP：パー《CPの勝ち》");
				lose++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：チョキ　相手：グー
			}else if(yourHand ==2 && cpHand ==1) {
				System.out.println("《結果》あなた：チョキ" + "　 " + "CP：グー《CPの勝ち》");
				lose++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：パー　相手：チョキ
			}else if(yourHand ==3 && cpHand ==2) {
				System.out.println("《結果》あなた：パー" + " 　" + "CP：チョキ《CPの勝ち》");
				lose++;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：グー　相手：グー
			}else if(yourHand ==1 && cpHand ==1) {
				System.out.println("《結果》あなた：グー" + "　 " + "CP：グー《あいこ》");
				win+=0;
				lose+=0;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;
				
//				自分：チョキ　相手：チョキ
			}else if(yourHand ==2 && cpHand ==2) {
				System.out.println("《結果》あなた：グー" + "　 " + "CP：グー《あいこ》");
				win+=0;
				lose+=0;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;

//				自分：パー　相手：パー
			}else if(yourHand ==3 && cpHand ==3) {
				System.out.println("《結果》あなた：パー" + "　 " + "CP：パー《あいこ》");
				win+=0;
				lose+=0;
				System.out.println("");
				System.out.println("【現在の成績】あなた：" + win + "勝" + "   " + "CP：" + lose + "勝");
				battle++;

//				１，２，３以外を入力したとき
			}else {
				System.out.println("入力値が誤っています");
				System.out.println("もう一度、第" + battle + "回戦を行います。");
			}
			
		}
//		最終結果
		if(lose < win) {
			System.out.println("【おめでとう！】あなたが先に３勝しました。じゃんけんを終了します。");
		}else {
			System.out.println("【残念！】CPが先に３勝しました。じゃんけんを終了します。");
		}
		
	}

}
