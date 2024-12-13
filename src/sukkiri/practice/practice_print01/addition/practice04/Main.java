package sukkiri.practice.practice_print01.addition.practice04;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		―５～５までのランダムな数値を発生させて表示してください。
//		実行結果
//		乱数値：-2  //値はー５～５のいずれか 
		
		Random rand = new Random();
		
		int r = rand.nextInt(11) - 5;
		
		System.out.println("乱数値：" + r);
		
		while (true) {
			int rr = rand.nextInt(11) - 5;
			if (rr == -5) {
				break;
			}
		}

	}

}
