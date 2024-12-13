package sukkiri.practice.practice_print16.practice03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		【HashMapの操作】
         下記表は東京の過去5年の１２月の平均気温です。
         HashMap＜String,String＞で宣言し、下記のデータをキーボードから入力し、
         Mapに追加していってください。
        （入力は、年と気温を一行で入力し、半角スペースで区切ってください。）
         次に、Mapのキーを全件表示してください。
        最後にキーボードから表示したい年を入力し、その入力されたものがMapのキーと一致した場合、
        気温を表示するプログラムを作成しましょう。
        ヒント：for文で入力後、半角スペースでsplitし配列に格納後、
        インデックス０に年、インデックス１に気温がString型で格納されるので、
        それをMapにputして追加する。

            2021年	2020年	2019年	2018年	2017年
             7.9℃	 7.7℃	 8.5℃	 8.3℃	 6.6℃

		        実行結果例
           2021年 7.9℃（入力）
           2020年 7.7℃（入力）
           2019年 8.5℃（入力）
           2018年 8.3℃（入力）
           2017年 6.6℃（入力）
           2021年（表示）
           2017年（表示）
           2018年（表示）
           2019年（表示）
           2020年（表示）
           表示したい年を入力してください。（表示）
           2019年（入力）
           8.5℃（表示）
		 */
		
		//Mapの宣言(インスタンス生成)
		HashMap<String, String> prefs = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		
		//要素(ペア)の追加処理
		for (int i = 0; i < 5; i++) {
			//入力受付
			System.out.print("年と気温を入力＞");
			String str = sc.nextLine();
			//分割
			String[] s = str.split(" ");
			//Mapに追加
			prefs.put(s[0], s[1]);
			
		}
		
		//Mapキー全件表示
		for (String key : prefs.keySet()) {
			System.out.println(key);
		}
		
		System.out.print(" 表示したい年を入力してください。＞");
		String year = sc.nextLine();
		
		String kion = prefs.get(year);
		
		System.out.println(kion);
		
		/*
		System.out.print(" 表示したい年を入力してください。＞");
		String year = sc.nextLine();
		
		for (String key : prefs.keySet()) {
			if (key.equals(year)) {
				System.out.println(prefs.get(key));
			}
		}
		*/
	}

}
