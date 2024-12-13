package sukkiri.practice.practice_print03.practie13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * While文を使い、０を入力するまで、延々とキーボードから
		 * 入力される整数値を加算していくプログラム(無限ループ、break文)
		*/
		Scanner sc = new Scanner(System.in);//Scannerの用意
		
		int a = 0;//和を格納する変数の用意
		
		while (true) {//while文(無限ループ)を作成
			System.out.print("入力：");
			int b = sc.nextInt();//入力値の受付
			
			if (b == 0) {//分岐処理
				break;//入力値が0→while文を離脱
			}
			a += b;//入力値が0以外→加算処理
		}
		System.out.println("合計:" + a);//和を表す変数を表示
	}

}
/*
 * Scannerの用意
 * 和を格納する変数の用意
 * while文(無限ループ)を作成
 * 		|-入力値の受付
 * 		|-分岐処理
 * 			|-入力値が0→while文を離脱
 * 			|-入力値が0以外→加算処理
 * 和を表す変数を表示
 */
 