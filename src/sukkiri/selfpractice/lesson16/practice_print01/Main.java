package sukkiri.selfpractice.lesson16.practice_print01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		問1	【ArrayListの基本操作】
//		(1)整数値を扱うArrayListを宣言してください。変数名はnumList
//		(2)文字列を扱うArrayListを宣言してください。変数名はstrList
//		(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
//		(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」
//		「出木杉君」を順番に追加してください。
//		(5)for文を使い変数numListの中身を順番に表示してください。
//		（要素数はsizeを使う。P584参照） 
//		(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
//		(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
//		(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(10);
		numList.add(100);
		numList.add(200);
		numList.add(5);
		numList.add(50);
		numList.add(500);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("のび太");
		strList.add("スネ夫");
		strList.add("ジャイアン");
		strList.add("しずかちゃん");
		strList.add("出木杉君");
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		

	}

}
