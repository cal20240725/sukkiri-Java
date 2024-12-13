package sukkiri.lesson02.code15;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//教科書のやり方
		/*int r = new java.util.Random().nextInt(90);
		 * int r = new java.util.Random().nextInt(200);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");*/
		
		//添付ファイルのやり方
		Random rand = new Random();
		int r = rand.nextInt(90);
		int rr = rand.nextInt(200);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		System.out.println("いや、" + rr + "歳ですね？");
	}

}
