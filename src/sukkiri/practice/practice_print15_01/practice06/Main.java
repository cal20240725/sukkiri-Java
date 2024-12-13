package sukkiri.practice.practice_print15_01.practice06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*郵便番号を表す正規表現を使って、キーボード入力した文字が
		  郵便番号を表すかどうか判定するプログラムを作りましょう。
		 
                   実行結果例１
                   >> 123-4567
                   郵便番号です

                  実行結果例２
                   >> 1234567
               郵便番号ではありません
        */
		
		//入力受付
		Scanner sc = new Scanner(System.in);
		
		System.out.print("郵便番号を入力＞");
		String input = sc.nextLine();
		
		//比較
		if (input.matches("^[0-9]{3}-[0-9]{4}$")) {
			System.out.println("郵便番号です");
		} else {
			System.out.println("郵便番号ではありません");
		}
		
	}

}
