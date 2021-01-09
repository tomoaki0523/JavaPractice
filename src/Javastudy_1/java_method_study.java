package Javastudy_1;

public class java_method_study {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      String name = "田中";
	  double japaneseScore = 85;
	  double mathScore = 66;
	  double height = 1.5;
	  double weight = 50.0;
      
	  printData(name, japaneseScore, mathScore);
      System.out.println(name +"さんの平均点は"+ average(japaneseScore, mathScore) + "点です。");
	  passOrNot(average(japaneseScore, mathScore));
	  grades(japaneseScore, mathScore);
	  bmi(height, weight);
	}
	  
//	  名前と点数の出力メソッド
	  public static void printData(String name, double japaneseScore, double mathScore) {
		  System.out.println(name + "さんの国語の点数は" + (int)japaneseScore + "です。");
		  System.out.println(name + "さんの数学の点数は" + (int)mathScore + "です。");
	 }
//	  平均点の出力メソッド
	  public static double average(double japaneseScore, double mathScore) {
		  return (japaneseScore + mathScore) / 2;
	 }
//	  合格判定の出力メソッド
	  public static void passOrNot(double average) {
		  if(average >= 70) {
				System.out.println("合格");
			}else {
				System.out.println("不合格");
			}
	  }
//		成績評価の出力メソッド
	  public static void grades(double japaneseScore, double mathScore) {
		  double total=japaneseScore + mathScore;
			if(japaneseScore < 40 || mathScore < 40) {
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
	  }
//	    BMIメソッド
	  public static void bmi(double height, double weight) {
		  double bmi =weight / (height * height);    //ここにも戻り値を使えるのか？
			
			if(bmi > 25) {
				System.out.println("[肥満]");
			}else if(bmi >= 18.5 && bmi <=25){
				System.out.println("[標準]");
			}else{
				System.out.println("[低体重]");
			}
	  }
	  
}

