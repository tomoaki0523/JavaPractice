package Javastudy_1;

import java.util.Scanner;
import java.util.Random;


public class Java_scan_random {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの今日のおみくじを引きます。");
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたのお名前は？");
		String input_text = scanner.nextLine();
		String[] luck = {"大吉","中吉","吉","凶","大凶"};
		Random i = new Random();
		System.out.println(input_text + "さんの今日のおみくじの結果は・・・" + luck[i.nextInt(5)]);
	
		scanner.close();
		
		
	}

}
