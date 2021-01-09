package Javastudy_1;

import java.util.Scanner;

public class java_scanner {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力してください＞");
		
		String input_text = scanner.nextLine();
		
		System.out.println(input_text + "が入力されました");
		
		scanner.close();
	}

}
