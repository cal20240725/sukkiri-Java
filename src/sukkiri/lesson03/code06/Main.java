package sukkiri.lesson03.code06;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		Random rand = new Random();
		int fortune = rand.nextInt(5)+1; 
		switch (fortune) {
		case 1, 2:
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4, 5:
			System.out.println("うーん...");
		}

	}

}
