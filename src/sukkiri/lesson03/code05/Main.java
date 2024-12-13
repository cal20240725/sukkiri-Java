package sukkiri.lesson03.code05;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("あなたの運勢を占います");
		Random rand = new Random();
		int fortune = rand.nextInt(5)+1;
		switch (fortune) {
		case 1, 2 -> {
			System.out.println("いいね！");
		}
		case 3 -> {
			System.out.println("普通です");
		}
		case 4, 5 -> {
			System.out.println("うーん...");
		}
		}
	}

}
