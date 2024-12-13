package sukkiri.practice.practice_print03.addition.practice01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		（if文、for文）
//		整数を５回キーボードから入力し最小値及び最大値を求めるプログラムを作りましょう。
//		最小値を持たせるための変数をint型minとする。
//		ｍinの初期値については、int型の持てる最大値になるInteger.MAX_VALUEを使うこと。
//		最大値を持たせるための変数をint型maxとする。
//		maxの初期値については、int型の持てる最小値になるInteger.MIN_VALUEを使うこと。
//		実行結果例
//		入力：5
//		入力：10
//		入力：8
//		入力：３
//		入力：１２
//
//		最小値は３です。（表示）
//		最大値は１２です（表示）
		
		Scanner sc = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			//入力受付
			System.out.print("入力：");
			int num = sc.nextInt();
			//最小値処理
			if (min > num) {
				min = num;
			//最大値処理	
			} else if (max < num) {
				max = num;
			}
		}
		
		System.out.println("最小値は" + min + "です。");
		System.out.println("最大値は" + max + "です。");

	}

}
