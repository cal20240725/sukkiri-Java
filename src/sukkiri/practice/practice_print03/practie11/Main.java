package sukkiri.practice.practice_print03.practie11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);//Scannerの用意
		/*
		System.out.print("入力：");
		double a = sc.nextInt();
		System.out.print("入力：");
		double b = sc.nextInt();
		System.out.print("入力：");
		double c = sc.nextInt();
		System.out.print("入力：");
		double d = sc.nextInt();
		System.out.print("入力：");
		double e = sc.nextInt();
		*/
		double s = 0;//和を格納する変数の用意
		//for文の作成
		for (int i = 0; i < 5; i++) {
			System.out.print("入力：");
			//|-入力値の受付
			double a = sc.nextInt();
			//|-和を格納する変数に入力値を加算
			s += a / 5;//平均値を表す変数を初期化(平均値=データの和/データの個数)
			
			//s = (a + b + c + d + e) / 5;
			//System.out.println("平均：" + s);
		}
		System.out.println("平均：" + s);//平均値を表す変数を表示
	}
	/*
	 * Scannerの用意
	 * 和を格納する変数の用意
	 * for文の作成
	 *    |-入力値の受付
	 *    |-和を格納する変数に入力値を加算
	 * 平均値を表す変数を初期化(平均値=データの和/データの個数)
	 * 平均値を表す変数を表示
	 */
}
