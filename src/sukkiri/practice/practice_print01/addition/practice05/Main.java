package sukkiri.practice.practice_print01.addition.practice05;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		0.0から1.0(1.0含まず)までのランダムな数値を発生させて表示してください。
//		実行結果
//		乱数値：0.876384632764846  
		
		Random rand = new Random();
		
		double r = rand.nextDouble();
		
		System.out.println("乱数値：" + r);

	}

}
