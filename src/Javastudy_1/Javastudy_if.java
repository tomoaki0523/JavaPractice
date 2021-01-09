package Javastudy_1;

public class Javastudy_if {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//下記変数定義をしましょう。
		//String型　変数名はStudent_name　初期値"田中"
		String Student_name ="田中";
		
		//double型　変数名はjapanese_score 初期値85
		double japanese_score=85;
				
		//double型　変数名はmath_score 初期値66
		double math_score=66;
		
		//国語の点数を「田中さんの国語の点数は85点です。」と表示させる
		System.out.println("田中さんの国語の点数は" + (int)japanese_score + "点です。");
		
		//数学の点数を「田中さんの数学の点数は66点です。」と表示させる
		System.out.println("田中さんの数学の点数は" + (int)math_score + "点です。");
		
		//double型で変数名をavarage_scoreとし、国語と数学の平均値を計算し、
		//「田中さんの平均点は●●点です。」と表示させる
		double average_score=(japanese_score + math_score) / 2;
		System.out.println("田中さんの平均点は" + average_score + "点です");

		//平均点が70点を超えれば合格、70点未満であれば不合格と表示させる
		if(average_score >= 70) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		// TODO 自動生成されたメソッド・スタブ
//		国語のテスト
//		数学のテスト
//
//		合計点が
//		160 点以上：“優”
//		159~140 点：“良”
//		139~100 点：“可”
//		100点未満：追試
//		※1教科40点未満が一つでもあれば追試
		double total=japanese_score + math_score;
		if(japanese_score < 40 || math_score < 40) {
		System.out.println("追試");
		}else if(total >= 160) {
			System.out.println("優");
		}else if(total <= 159 && total >= 140) {
			System.out.println("良");
		}else if(total <= 139 && total >= 100) {
			System.out.println("可");
		}else if(total < 100) {
			System.out.println("追試");
		}
		
		
		//javaDay1の課題
		//身長を定義
		double height=1.7;
		//体重を定義
		double weight=70.0;
		//BMIが25より高い場合[肥満]、18.5~25の場合[標準]、18.5未満の場合[低体重]と表示させる
		double bmi =weight / (height * height);
		
		if(bmi > 25) {
			System.out.println("[肥満]");
		}else if(bmi >= 18.5 && bmi <=25){
			System.out.println("[標準]");
		}else{
			System.out.println("[低体重]");
		}
	}

}
