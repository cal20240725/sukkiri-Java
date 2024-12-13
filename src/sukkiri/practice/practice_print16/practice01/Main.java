package sukkiri.practice.practice_print16.practice01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		/*
		  【ArrayListの基本操作】
           (1)整数値を扱うArrayListを宣言してください。変数名はnumList
           (2)文字列を扱うArrayListを宣言してください。変数名はstrList
           (3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
           (4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」
           「出木杉君」を順番に追加してください。
           (5)for文を使い変数numListの中身を順番に表示してください。
           （要素数はsizeを使う。P584参照） 
           (6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
           (7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
           (8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		 */

		//(1)整数値を扱うArrayListを宣言してください。変数名はnumList
		ArrayList<Integer> numList = new ArrayList<Integer>();
		// (3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
		numList.add(1);
		numList.add(10);
		numList.add(100);
		numList.add(200);
		numList.add(5);
		numList.add(50);
		numList.add(500);

		// (2)文字列を扱うArrayListを宣言してください。変数名はstrList
		ArrayList<String> strList = new ArrayList<String>();
		//(4)変数strListに「のび太」「すねお」「ジャイアン」
		//「しずかちゃん」「出木杉君」を順番に追加してください。
		strList.add("のび太");
		strList.add("スネ夫");
		strList.add("ジャイアン");
		strList.add("しずかちゃん");
		strList.add("出木杉君");

		//(5)for文を使い変数numListの中身を順番に表示してください。(要素数はsizeを使う。P584参照）
		System.out.println("for文を使い変数numListの中身を順番に表示");
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}

		// (6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
		System.out.println("イテレータを使い変数strListの中身を順番に表示");
		Iterator<String> it = strList.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

		// (7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
		System.out.println("for文を使い変数numListの中身の値が100以上の要素を削除");
		//一回戻るやり方
//		for (int i = 0; i < numList.size(); i++) {
//			if (numList.get(i) >= 100) {
//				numList.remove(i);
//				i--;
//			}
//		}
		
		//(7)の他のやり方(後ろから数えて削除するやり方)
//		for (int i = numList.size() - 1; i >= 0; i--) {
//			if (numList.get(i) >= 100) {
//				numList.remove(i);
//			}
//		}
		
		//(7)の他のやり方(Iteratorを使ったやり方)
		Iterator<Integer> it_int = numList.iterator();
		while (it_int.hasNext()) {
			if (it_int.next() >= 100) {
				it_int.remove();
			}
		}

		//(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		System.out.println("拡張for文を使い変数numListの中身を順番に表示");
		for (int num : numList) {
			System.out.println(num);
		}



	}

}
