package sukkiri.practice.practice_print16.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* 
		 【ArrayListの操作】
          Integer型(整数)でArrayListを宣言し、キーボードから数値を複数回入力し、
          ArrayListに入力した値を追加していってください
          (入力する回数は別途キーボードから回数を指定する)
          その後、ArrayListの中にある数値から最小値を表示するようにプログラムを作成してください。
          処理手順：
          ①   キーボードから入力する回数を変数nに代入。
          ②   for文を使い、n回キーボードから数値の入力を繰り返し、ArrayListに追加していく。
          ③   for文を再度使い、if文を使って最小値を求める。
          ④   求めた最小値を表示する。
		 */

		Scanner sc = new Scanner(System.in);
		
		//ArrayListの宣言(インスタンス生成)
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		//数値を追加する回数の入力を受付
		System.out.print("回数を入力＞");
		int n = sc.nextInt();

		int min = Integer.MAX_VALUE;
		
		//リストに追加処理
		for (int i = 0; i < n; i++) {
			System.out.print("数値を入力＞");
			int n2 = sc.nextInt();
			numList.add(n2);
			//リストの要素から最小値を求める処理
			for (int j = 0; j < numList.size(); j++) {
				if (numList.get(i) < min) {
					min = numList.get(i);
				}
			}

		}
		//最小値の表示
		System.out.println(min);
	}

}
