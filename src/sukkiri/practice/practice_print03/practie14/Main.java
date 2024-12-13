package sukkiri.practice.practice_print03.practie14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*キーボードから直角三角形の段数を入力し、
		 * for文の二重ループを使って、
		 * 左下側が直角の直角三角形を表示するプログラム
		*/
		
		Scanner sc = new Scanner(System.in);//Scannerの用意
		
		System.out.print("入力：");
		int a = sc.nextInt();//入力値の受付
		
		//for文(二重ループ)
		for (int i = 0; i <= a; i++) {//行は外側のfor文(ループ変数i)
		 for (int j = 0; j <= i; j++) {//列は内側のfor文(ループ変数j)
			 System.out.print("*");
		 }
		 System.out.println("");
		}

	}

}
/*
ステップ1．教科書コード3-9を参考にし、正方形を表示させる
ステップ2．行と列の対応関係を考える
1行目は＊1つ
2行目は＊2つ
3行目は＊3つ
行は外側のfor文(ループ変数i)
列は内側のfor文(ループ変数j)
行と列の対応関係とは、行(ループ変数i)と列(ループ変数j)との関係を考えてみる
*/