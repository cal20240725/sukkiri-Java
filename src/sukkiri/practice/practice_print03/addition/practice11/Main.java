package sukkiri.practice.practice_print03.addition.practice11;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		終了を選ぶまでじゃんけんを繰り返すプログラムを以下の条件で作成しましょう。
//		①	じゃんけんを繰り返すかどうかの判定を持つboolean型変数boolを用意する
//		    boolがtrueの時は繰り返す、falseの時は繰り返さない。
//		②	じゃんけんを繰り返す処理はwhile文を使う（boolを条件式に使う）
//		③	do-while文を使い、「グー：０，チョキ：１，パー：２」以外の値が入力された場合、
//		    再度入力を求めるようにする。
//		④	NPCの手は乱数を使う
//		⑤	お互いの手を表示する箇所はswitch文を使う
//		⑥	勝敗判定はif-else if-elseを使い、
//		   「あなたの勝ち」「あなたの負け」「あいこ」を表示する
//		⑦	「再度対戦しますか？(y/n)」をdo-while文を使い
//		     yとn以外が入力された場合は再度入力を求めるようにする。
//		     （ｙの時は再度じゃんけんする。ｎの時はじゃんけんを終了する）
//		⑧	じゃんけんを終了する時は「プログラムを終了します」を表示する
//		実行結果例  （表示内容と入力例）
//		あなたの手を入力してください（グー：０，チョキ：１，パー：２）:3(表示と入力)
//		あなたの手を入力してください（グー：０，チョキ：１，パー：２）:-1(表示と入力)
//		あなたの手を入力してください（グー：０，チョキ：１，パー：２）:0(表示と入力)
//		あなたの手はグーです(表示)
//		NPCの手はパーです(表示)
//		あなたの負けです(表示)
//		再度対戦しますか？(y/n) :y(表示と入力)
//		あなたの手を入力してください（グー：０，チョキ：１，パー：２）:1(表示と入力)
//		あなたの手はチョキです(表示)
//		NPCの手はパーです(表示)
//		あなたの勝ちです(表示)
//		再度対戦しますか？(y/n) :y(表示と入力)
//		あなたの手を入力してください（グー：０，チョキ：１，パー：２）:2(表示と入力)
//		あなたの手はパーです(表示)
//		NPCの手はパーです(表示)
//		あいこです(表示)
//		再度対戦しますか？(y/n) :o(表示と入力)
//		再度対戦しますか？(y/n) :n(表示と入力)
//		プログラムを終了します(表示)
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//boolean型変数boolの用意
		boolean bool = true;
		
		//while文
		while (bool) {
			
			//自分の手の変数yourHandの初期化
			int yourHand = 0;
			
			//do_while文
			//自分の手の入力受付
			do {
				
				System.out.print("あなたの手を入力してください。（グー：０，チョキ：１，パー：２）:");
				yourHand = sc.nextInt();
				
			} while (yourHand < 0 || yourHand > 2 );
//			  while (yourHand != 0 && yourHand != 1 && yourHand != 2);
			
			//乱数を用いてNPCの手を決める
			int npcHand = rand.nextInt(3);
			
			//switch文で自分の手、NPCの手をそれぞれ表示
			switch (yourHand) {
			case 0 -> {
				System.out.println("あなたの手はグーです。");
			}
			case 1 -> {
				System.out.println("あなたの手はチョキです。");
			}
			case 2 -> {
				System.out.println("あなたの手はパーです。");
			}
			}
			
			
			switch (npcHand) {
			case 0 -> {
				System.out.println("NPCの手はグーです。");
			}
			case 1 -> {
				System.out.println("NPCの手はチョキです。");
			}
			case 2 -> {
				System.out.println("NPCの手はパーです。");
			}
			}
			
			//じゃんけんの結果を表示
			if ((yourHand == 0 && npcHand == 1) || (yourHand == 1 && npcHand == 2) ||  (yourHand == 2 && npcHand == 0)) {//勝つ場合
				System.out.println("あなたの勝ちです。");
			} else if ((yourHand == 0 && npcHand == 2) || (yourHand == 1 && npcHand == 0) ||  (yourHand == 2 && npcHand == 1)) {//負ける場合
				System.out.println("あなたの負けです。");
			} else {//あいこ
				System.out.println("あいこです。");
			}
			
			//じゃんけん結果の別の方法
//			if ((yourHand - npcHand + 3 ) % 3 == 2) {//勝つ場合
//				System.out.println("あなたの勝ちです。");
//			} else if ((yourHand - npcHand + 3) % 3 == 1) {//負ける場合
//				System.out.println("あなたの負けです。");
//			} else {//あいこ
//				System.out.println("あいこです。");
//			}
			
			//do_while文
			sc.nextLine();//スペースを入れるためのやつ
			
			String str = null;
			
			do {
				
				System.out.print("再度対戦しますか？(y/n) :");
				str = sc.nextLine();
				
			} while (!(str.equals("y") || str.equals("n")));		
//			  while (!(str.equals("y")) && !(str.equals("n"));
			
			if (str.equals("n")) {
				bool = false;
//				break;
			}
		}
		
		System.out.println("プログラムを終了します。");

	}

}
