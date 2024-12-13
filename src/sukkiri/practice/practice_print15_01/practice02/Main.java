package sukkiri.practice.practice_print15_01.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*文字列をキーボードから入力し、
		  入力された文字列の長さを表示するプログラムを書きましょう。
		
                   実行結果例
           入力：にほんむかしばなし(入力)
             文字列の長さ：９(表示)
        */
		
		//入力受付
		Scanner sc = new Scanner(System.in);
		
		System.out.print("文字を入力＞");
		String str = sc.nextLine();
		
		//入力値の長さを変数に格納
		//int length = str.length();
		
		//表示
		System.out.println("文字列の長さ：" + str.length());
		//System.out.println("文字列の長さ：" + length);
	}

}
