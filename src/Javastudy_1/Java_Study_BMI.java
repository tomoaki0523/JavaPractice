package Javastudy_1;

public class Java_Study_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="小松知顕";
		String gender ="男";
		double height =1.7;
		double weight =80.0;
		
		System.out.println("名前：" + name);
		System.out.println("性別：" + gender);
		System.out.println("身長：" + height +"m");
		System.out.println("体重：" + weight +"kg");
		System.out.println("BMI：" + weight / (height * height));
		
		
	}

}
