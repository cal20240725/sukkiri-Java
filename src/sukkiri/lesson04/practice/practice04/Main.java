package sukkiri.lesson04.practice.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①int型で要素数3の配列numbersを準備する。初期値は3・4・9とする。
		//②画面に「1桁の数字を入力してください」と表示すること
		//③キーボードから数字の入学を受け付け、変数inputに代入する。
		//④配列をループで回しながら、いずれかの要素と等しいかを調べる。
		//もし等しければ「アタリ！」と表示する。

		
		Scanner sc = new Scanner(System.in);//入力受付の準備

		int[] numbers = {3, 4, 9};//int型で要素数3の配列
		System.out.println("１桁の数字を入力してください");
		int input = sc.nextInt();//入力を受付てinputに代入

		for (int i = 0; i < numbers.length; i++) {//for文で配列を回す
			if (numbers[i] == input) {//numbersとinputが等しければ
				System.out.println("アタリ！");//これを表示する
			}
		}
		
		//拡張for文
		/*
		for (int num : numbers) {
			if (input == num) {
				System.out.println("アタリ！");
			}
			
		}*/
	}

}
