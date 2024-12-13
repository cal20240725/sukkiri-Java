package sukkiri.practice.practice_print03.addition.practice10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		キーボードから直角三角形の段数を入力し、
//		for文の二重ループを使って、
//		右上側が直角の直角三角形を表示するプログラムを作成しましょう。
//		実行結果例  5段の場合
//		入力：5
//
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("入力：");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
