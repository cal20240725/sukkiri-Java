package sukkiri.practice.practice_print16.practice05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		【メソッド間のArrayListの操作】
		メソッド名： main
		引数：String[] args
		戻り値：void
		処理の内容： 
		1.スキャナを使えるようにし、乱数を作成する個数を入力させる。
		2.getListDataメソッドに入力した値を引数で渡した後、戻り値を受け取る。
		3.showListDataメソッドにArrayListを引数に入れて渡す

		実行結果例
		乱数を作成する数を指定してください：10
		61
		82
		94
		7
		65
		48
		84
		97
		86
		28
		 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("乱数を作成する数を指定してください：");
		int num = sc.nextInt();
		
		//getListDataメソッドに入力した値を引数で渡した後、戻り値を受け取る
		ArrayList<Integer> list = getListData(num);//戻り値があるやつは変数に格納
		
		//showListDataメソッドにArrayListを引数に入れて渡す
//		ArrayList<Integer> list = new ArrayList<>();
		showListData(list);

	}

	public static ArrayList<Integer> getListData(int num){
		/*
		メソッド名： getListData
		引数：int型
		戻り値：ArrayList<Integer>
		処理の内容： 
		1.	ArrayListを変数名listとし宣言する
		2.	引数で受け取った整数の回数だけ乱数を発生させ、listに追加する。
		乱数については０～９９の範囲とする。
		3.listを戻り値として返す。
		 */

		//ArrayListの宣言
		ArrayList<Integer> list = new ArrayList<Integer>();

		//乱数生成・追加
		Random rand = new Random();

		for (int i = 0; i < num; i++) {
			//ラン数値の生成
			int r = rand.nextInt(100);
			//追加
			list.add(r);
		}

		//変数listを返す
		return list;
	}

	public static void showListData(ArrayList<Integer> list) {
		/*
		メソッド名： showListData
		引数：ArrayList
		戻り値：なし
		処理の内容： 引数で受け取ったリストを、for文を使い中身を表示する。
		 */
		
		for (int i : list) {
			System.out.println(i);
		}
	}

}



