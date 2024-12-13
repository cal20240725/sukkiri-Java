package sukkiri.practice.practice_print03.practie12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for文を使い、整数を3回入力し最小値を求めるプログラム
		Scanner sc = new Scanner(System.in);//Scannerの用意
		/*
		キーボードから入力した値を受け取るint型変数を用意する。
		最小値を入れるためのint型変数を用意する。（for文の外に事前に用意しておく）
		for文の中で、if文の練習問題問５のような
		if文の条件処理のプログラムを書いていく。
		 */
		int s = Integer.MAX_VALUE;/*最小値を表す変数の初期化
									(int型の最大値を初期値とする)*/
		for (int i = 0; i < 3; i++) {//for文の作成
			System.out.print("入力：");
			int a = sc.nextInt();
			//|-入力受付
			if (a < s) {
				s = a;
			//|-最小値の更新処理
			}
		}
		System.out.println("最小値は" + s +"です。");// 最小値の表示
	}

}
/*
 * Scannerの用意
 * 最小値を表す変数の初期化(int型の最大値を初期値とする)
 * for文の作成
 *    |-入力受付
 *    |-最小値の更新処理
 * 最小値の表示
 */