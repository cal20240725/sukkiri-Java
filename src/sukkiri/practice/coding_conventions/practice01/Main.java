package sukkiri.practice.coding_conventions.practice01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//入力準備
		Scanner sc = new Scanner(System.in);
		
		//リンゴの単価と個数の受付
		System.out.print("リンゴの単価を入力: ");
		double applePrice = sc.nextInt();
		System.out.print("リンゴの個数を入力: ");
		int appleNunber = sc.nextInt();
		
		//バナナの単価と個数の受付
		System.out.print("バナナの単価を入力: ");
		double bananaPrice = sc.nextInt();	
		System.out.print("バナナの個数を入力: ");
		int bananaNunber = sc.nextInt();
		
		//さくらんぼの単価と個数の受付
		System.out.print("さくらんぼの単価を入力: ");
		double cherryPrice = sc.nextInt();	
		System.out.print("さくらんぼの個数を入力: ");
		int cherryNunber = sc.nextInt();
		
		//果物の単価と個数をallTotalに渡す
		double ft = allTotal(applePrice, appleNunber, bananaPrice, bananaNunber,
				              cherryPrice, cherryNunber);
		
		System.out.println("合計金額:" + ft + "円");
	}

	//合計金額を計算するメソッド
	public static double allTotal(double ap, double an, double bp, double bn,
			                      double cp, double cn) {
		
		//それぞれの単価と個数を掛け算する
		double at = ap * an;
		double bt = bp * bn;
		double ct = cp * cn;
		
		//全部足し算する
		double allt = at + bt + ct;
		
		//足し算の結果をmainに返す
		return allt;
	}

}
