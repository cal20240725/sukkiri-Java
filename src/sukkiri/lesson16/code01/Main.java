package sukkiri.lesson16.code01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		 *ArrayListの宣言
		 * ArrayList<型> 変数名 = new ArrayList<型>();
		 * ArrayList<型> 変数名 = new ArrayList< [省略可能] >();
		 * 
		 * List<型> 変数名 = new ArrayList< [省略可能] >(); 
		 */

		ArrayList<Integer> points = new ArrayList<Integer>();//Integer型でArrayListを宣言
		//List<Integer> points = new ArrayList<>();これでも可

		/*
		 * メソッドの使い方
		 * インスタンス変数名.メソッド();
		 */
		points.add(10);
		points.add(80);//自動的にIntegerに変換、格納される
		points.add(75);

		//拡張for文で要素を表示
		System.out.println("*拡張for文で要素を表示*");
		for (int i : points) {//拡張for文も利用可能
			System.out.println(i);
		}
		
		System.out.println();
		
		//for文で要素を表示
		System.out.println("*for文で要素を表示*");
		for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}
		
		/*
		 *iteratorで要素を表示
		 *①iteratorインスタンスを作成
		 *②while文で取得
		 */
		System.out.println("*iteratorで要素を表示*");
	}

}
