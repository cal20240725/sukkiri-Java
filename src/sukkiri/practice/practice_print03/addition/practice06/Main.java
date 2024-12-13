package sukkiri.practice.practice_print03.addition.practice06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		 do-while文を使い、「ｙ/n」が入力されるまで再入力を求めるプログラムを作成しましょう。
//		 実行結果例 
//		 入力してください（y/n）:o（表示：入力）
//		 入力してください（y/n）:u（表示：入力）
//		 入力してください（y/n）:y（表示：入力）
//		 プログラムを終了します。（表示）
		
		Scanner sc = new Scanner(System.in);
		
		//String型変数のstrの初期化
		String str = null;
		
		do {
			System.out.print("入力してください（y/n）:");
			str = sc.nextLine();
			
		} while (!(str.equals("y")) && !(str.equals("n")));
//		  while (!(str.equals("y")) || str.equals("n")));
		
		
		//別解
//		do {
//			System.out.print("入力してください（y/n）:");
//			String str = sc.nextLine();
//			
//			if (str.equals("y") || str.equals("n")) {
//				break;
//			}
//			
//		} while (true);
		
		//別解
//		boolean bool = false;
//		
//		do {
//			System.out.print("入力してください（y/n）:");
//			String str = sc.nextLine();
//			
//			if (!(str.equals("y")) || str.equals("n")) {
//				bool = true;
//			} else {
//				bool = false;
//			}
//			
//		} while (bool);
		
		
		
		System.out.println("プログラムを終了します。");
	}

}
