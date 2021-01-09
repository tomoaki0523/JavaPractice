package Javastudy_1;

public class Javastudy_hairetsu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int maxNum =10;
		String[] names = {"青木","井上","太田","加藤","佐藤","鈴木","田中","中村","山田","渡辺"};
		for(int num=0; num < maxNum; num++) {
			System.out.println(names[num] + "くんいる？");
		}
		String[] days = {"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat"};
		String[] daysJp = {"日曜","月曜","火曜","水曜","木曜","金曜","土曜"};
		int j = 7;
		for(int i=0; i < j; i++) {
			System.out.println(daysJp[i] + "日は英語では" + days[i] + "です");	
		}
	}

}
