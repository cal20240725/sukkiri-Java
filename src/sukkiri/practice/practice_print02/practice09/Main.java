package sukkiri.practice.practice_print02.practice09;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("グー：０、チョキ：１、パー：２");
		System.out.print("あなたの手を入力：");
		int yourHand = sc.nextInt();

		Random rand = new Random();
		int conHand = rand.nextInt(3);

		/*if (yourHand >= 3) {
			System.out.println("入力が不正です");
		} else if (yourHand < 3) {
			if (yourHand == 0)
				System.out.println("あなたの手はグーです");
			if (yourHand == 1)
				System.out.println("あなたの手はチョキです");
			if (yourHand == 2)
				System.out.println("あなたの手はパーです");
		} 
		if (conHand < 3) {
			if (conHand == 0)
				System.out.println("コンピュータの手はグーです");
			if (conHand == 1)
				System.out.println("コンピュータ手はチョキです");
			if (conHand == 2)
				System.out.println("コンピュータ手はパーです");
		} else if (yourHand >= 3) {
			
		if (yourHand < 3) {
			if (yourHand < conHand) 
				System.out.println("あなたの勝ちです。");
			if (yourHand > conHand) 
				System.out.println("あなたの負けです。");
			if (yourHand == conHand) 
				System.out.println("あいこです。");
		}
		}*/


		//模範解答
		if (yourHand == 0 || yourHand == 1 || yourHand == 2) {

			if (yourHand == 0) {
				System.out.println("あなたの手はグーです");
			} else if (yourHand == 1) {
				System.out.println("あなたの手はチョキです");
			} else {
				System.out.println("あなた手はパーです");
			}

			if (conHand == 0) {
				System.out.println("あなたの手はグーです");
			} else if (conHand == 1) {
				System.out.println("あなたの手はチョキです");
			} else {
				System.out.println("あなた手はパーです");
			}

			if ((yourHand == 0 && conHand == 1) || (yourHand == 1 && conHand == 2) ||  (yourHand == 2 && conHand == 0)) {//勝つ場合:グーで勝つ、チョキで勝つ、パーで勝つ
				System.out.println("あなたの勝ちです。");
			} else if ((yourHand == 0 && conHand == 2) || (yourHand == 1 && conHand == 0) ||  (yourHand == 2 && conHand == 1)) {//負ける場合
				System.out.println("あなたの負けです。");
			} else {//あいこの場合
				System.out.println("あいこです。");
			}
			
			}else {
				System.out.println("入力が不正です");
			}
		}

	}
//}

