package sukkiri.lesson04.code12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		//箱の用意
		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = rand.nextInt(4);
		}
		
		for (int i = 0; i < seq.length; i++) {
			System.out.println("seq[" + i + "]:" + seq[i]);
		}
		
		System.out.println("--------塩基配列を表示---------");
		
		//生成した塩基配列の記号を表示
		/*
		for (int i = 0; i < seq.length; i++) {
			/*
			System.out.println("seq[" + i + "]の乱数値を塩基配列で表すと:");
			switch (seq[i]) {
			case 0 -> {
				System.out.print("A ");
			}
			case 1 -> {
				System.out.print("T ");
			}
			case 2 -> {
				System.out.print("G ");
			}
			case 3 -> {
				System.out.print("C ");
			}
			}
			*/
			//コード4-12で出力したいもの＝＞ランダムにATGCを10個表示したい
			//塩基配列を作成
			char[] base1 = {'A', 'T', 'G', 'C'};
			
			//ランダムにATGCを10個表示
			for (int i = 0; i < seq.length; i++) {
				System.out.print(base1[seq[i]] + " ");
				
				int baseType = seq[1];
				char baseChar = base1[baseType];
				System.out.println(baseChar + " ");
				
				
				/*
				int a = rand,nextInt(4)
				System.out.print("|乱数：" + a + "| ");
				System.out.print(base1[a] + " ");
				*/
			}
		
		}

	}

}
