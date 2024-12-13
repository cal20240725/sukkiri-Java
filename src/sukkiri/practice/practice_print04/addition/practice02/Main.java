package sukkiri.practice.practice_print04.addition.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		以下の手順でプログラムを作成しましょう。
//		(1)9×9の形の二次元配列を宣言してください。（int型配列　変数名MulTable）
//		(2)二重for文を使い、MulTableに九九の値をセットしてください
//		（配列のインデックスと九九の桁が異なるため、配列の要素に値を入れるときは少し工夫が必要。）
//
//		(3)キーボードから整数値を入力し、それがMulTableに存在するかどうか調べる。
//		二重for文とif文を使い、入力値が存在する場合は全ての組み合わせと件数を表示する。
//		存在しない場合は、「入力値が九九の表には存在しません」と表示する。
//		実行結果例	実行結果例
//		整数値を入力：16（入力）
//		２×８（表示）
//		４×４（表示）
//		８×２（表示）
//		３件見つかりました。（表示）
//		
//		整数値を入力：73（入力）
//		入力値が九九の表には存在しません（表示）
		
		Scanner sc = new Scanner(System.in);
		
		int[][] MulTable = new int[9][9];
		
		for (int i = 0; i < MulTable.length; i++) {
			for (int j = 0; j < MulTable.length; j++) {
				MulTable[i][j] = (i + 1) * (j + 1);
				System.out.printf("%3d", MulTable[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.print("整数値を入力：");
		int num = sc.nextInt();
		int count = 0;
		
		//積の組を調べる処理
		for (int i = 0; i < MulTable.length; i++) {
			for (int j = 0; j < MulTable.length; j++) {
				if (MulTable[i][j] == num) {// if ((i + 1) * (j + 1) == num) これでもいける
					System.out.println((i + 1) + "×" + (j + 1));
					count++;
				} 
			}
		}
		
		if (count > 0) {
			System.out.println(count + "件見つかりました。");
		} else {
			System.out.println("入力値が九九の表には存在しません。");
		}
		
	}

}
