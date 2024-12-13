package sukkiri.practice.practice_print02.practice09.other;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//模範解答を短くしたもの
		Scanner sc = new Scanner(System.in);
		System.out.println("グー：０、チョキ：１、パー：２");
		System.out.print("あなたの手を入力：");
		int yourHand = sc.nextInt();

		Random rand = new Random();
		int conHand = rand.nextInt(3);

		if (0 <= yourHand && yourHand <= 2) {//yourHandが

			if (yourHand == 0) {
				System.out.println("あなたの手はグーです");
			} else if (yourHand == 1) {
				System.out.println("あなたの手はチョキです");
			} else {
				System.out.println("あなた手はパーです");
			}

			if (conHand == 0) {
				System.out.println("コンピュータの手はグーです");
			} else if (conHand == 1) {
				System.out.println("コンピュータの手はチョキです");
			} else {
				System.out.println("コンピュータの手はパーです");
			}

			if ((yourHand - conHand + 3) % 3 == 2) {//勝つ場合:グーで勝つ、チョキで勝つ、パーで勝つ
				System.out.println("あなたの勝ちです。");
			} else if ((yourHand - conHand + 3) % 3 == 1) {//負ける場合
				System.out.println("あなたの負けです。");
			} else {//あいこの場合
				System.out.println("あいこです。");
			}

		} else {
			System.out.println("入力が不正です");
		}
	}

}
