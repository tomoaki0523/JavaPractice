package JavaMyStudy;

public class Javastudy_method_person {
	
//	インスタンスフィールドの定義
	private String studentName;
	private double japaneseScore;
	private double mathScore;
	private double height;
	private double weight;
	
//	コンストラクタ
	Javastudy_method_person(String studentName, double japaneseScore, double mathScore,double height, double weight){
		this.studentName = studentName;
		this.japaneseScore = japaneseScore;
		this.mathScore = mathScore;
		this.height = height;
		this.weight = weight;
	}
	
	public void printData() {
		System.out.println(this.studentName + "さんの国語の点数は" + (int)this.japaneseScore + "です。");
		System.out.println(this.studentName + "さんの数学の点数は" + (int)this.mathScore + "です。");
	}
	
}
