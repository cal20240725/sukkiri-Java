package sukkiri.practice.practice_print03.addition.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//		While文を使い０を入力するまで、
		//		延々とキーボードから入力される正の整数値を加算していく  
		//		プログラムを作成しましょう。
		//		負の整数値が入力された場合は加算しない。（無限ループ、break文、continue文、if文）
		//		実行結果例
		//		入力：３
		//		入力：２
		//		入力：４
		//		入力：１
		//		入力：-3
		//		入力：５
		//		入力：０
		//
		//		合計は15です。（表示）

		Scanner sc = new Scanner(System.in);

		int count = 0;
		
		//無限ループ
		while (true) {
			//入力受付
			System.out.print("入力：");
			int num = sc.nextInt();
			
			//加算処理
			if (num > 0) {
				count += num;
			} else if (num == 0) {
				break;
			} else if (num < 0) {
				continue;
			}

		}

		System.out.println("合計は" + count + "です。");

	}

}
