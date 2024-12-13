package sukkiri.practice.practice_print01.addition.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		int型変数nにキーボードから値を入力させ、
//		０～ｎまでのランダムな数値を発生させて値を表示してください。
//		実行結果
//		整数n：1000 (キーボード入力)
//		乱数値：938  //値は０～nのいずれか
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数n：");
		int n = sc.nextInt();
		
		int r = rand.nextInt(n);
//		int r = rand.nextInt(n + 1);
		
		System.out.println("乱数値：" + r);

	}

}
