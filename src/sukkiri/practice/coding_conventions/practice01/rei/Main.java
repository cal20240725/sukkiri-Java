package sukkiri.practice.coding_conventions.practice01.rei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	/**
	 *問題：ショッピングカートの合計金額を計算するプログラムの作成
		目的：
		・適切な変数名、メソッド名を使うこと
		・コードにコメントを記述し、コードの動きを説明すること
		
		問題内容：
		以下の仕様に従って、ショッピングカートの合計金額を計算するプログラムを
		作成してください。
		1.	ユーザーが購入する商品は3種類（例: "apple", "banana", "cherry"）で、
			それぞれの単価と個数を保持する。
		2.	各商品の価格と個数を変数に格納し、それを元に合計金額を計算するメソッドを
			作成する。
		3.	メソッド名や変数名は、何を表すのかが分かりやすいものにする。
		4.	プログラム中にコメントを書き、何をしているのかを説明する。

		条件：
		•	商品の価格と個数は、ユーザーが入力した値を使う。
		•	合計金額を出力する。
		•	変数やメソッドの名前は意味がわかるようにすること。
		•	上記の入力はmainメソッド内で行う。
		•	上記の「合計金額」については、メソッドを作成して、
			そのメソッド内で合計金額を求め、呼び出し元に返す。
		
		出力結果例
		リンゴの単価を入力: 150
		リンゴの個数を入力: 3
		バナナの単価を入力: 110
		バナナの個数を入力: 2
		さくらんぼの単価を入力: 25
		さくらんぼの個数を入力: 5
		合計金額: 795.0円

	 */

	/**
	 * 商品を追加する時はHashMap<String, Integer> 商品名(小文字) を作り、
	 　単価と個数をそれぞれをキーとして値を入力。そのHashMapをlistに追加すること。
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		// キーボード入力の用意
		Scanner sc = new Scanner(System.in);
		
		// 購入する商品名のHashMapを用意して、それぞれの単価と個数を格納する
		 Map<String, Integer> apple = new HashMap<>();
		 Map<String, Integer> banana = new HashMap<>();
		 Map<String, Integer> cherry = new HashMap<>();
		
		// それぞれの単価と個数を入力させて、変数に格納する
		// リンゴの単価と個数
		System.out.print("リンゴの単価を入力: ");
		apple.put("単価", sc.nextInt());
		System.out.print("リンゴの個数を入力: ");
		apple.put("個数", sc.nextInt());
		
		// バナナの単価と個数
		System.out.print("バナナの単価を入力: ");
		banana.put("単価", sc.nextInt());
		System.out.print("バナナの個数を入力: ");
		banana.put("個数", sc.nextInt());
		
		// さくらんぼの単価と個数
		System.out.print("さくらんぼの単価を入力: ");
		cherry.put("単価", sc.nextInt());
		System.out.print("さくらんぼの個数を入力: ");
		cherry.put("個数", sc.nextInt());
		
		// それぞれの商品のMapを1つにまとめてHashMap< String, Map<Strin, Integer> > にする
		Map<String, Map<String, Integer>> list = new HashMap<>();
		list.put("リンゴ", apple);
		list.put("バナナ", banana);
		list.put("さくらんぼ", cherry);
		
		// totalSumを呼び出して、値を受け取る
		int sum = totalSum(list);
		
		// 合計値を表示
		System.out.println("合計金額: " + sum);
		
	}
	
	/**
	 * メソッド名：totalSum
	 * 戻り値：int型
	 * 引数：Map<String, Map<String, Integer>>
	 * 処理：入力した値を受け取って、合計金額を返す
	 */
	public static int totalSum( Map<String, Map<String, Integer>> list ) {
		// 合計値を格納する変数の用意
		int sum = 0;
		// 小計値を格納する変数の用意
		int ss = 0;
		
		// for文で値を取り出しながら、合計値を計算する
		for( String e : list.keySet() ) {
			for( String g : list.get(e).keySet() ) {
				if( ss == 0 ) {
					ss = list.get(e).get(g);
				} else {
					ss = ss * list.get(e).get(g);
				}
			}
			sum += ss; // 小計を合計値に追加
			ss = 0; // 小計を初期化しておく
		}
		
		return sum;
		
	}
	
}
