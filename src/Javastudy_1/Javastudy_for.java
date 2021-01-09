package Javastudy_1;

public class Javastudy_for {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i <= 10; i++) {
			System.out.println("犬が" + i + "匹");
		}
		
//		【問題】2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
		
		for(int j =1, result=2; j <= 8; j++, result *=2) {
			System.out.println("2の" + j + "乗は" + result);
		}
		
		for(int k =20; k >= 0; k--) {
			System.out.println(k);
		}
		
	}
	
	

	
}
