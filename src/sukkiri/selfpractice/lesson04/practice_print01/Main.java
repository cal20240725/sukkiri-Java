package sukkiri.selfpractice.lesson04.practice_print01;

public class Main {
	public static void main(String[] args) {
		/*
		 *(1)要素数3のint型配列numbersの宣言をしてください
          (2)要素数5のString型配列namesの宣言をしてください。
          (3)配列numbersの0番目に100、1番目に200、
             ２番目に300を代入してください。
          (4)配列namesの０番目に「のび太」、1番目に「すねお」、
             ２番目に「ジャイアン」、３番目に「しずかちゃん」、
             ４番目に「出木杉君」を代入してください。
          (5)配列numbersの２番目の中身を表示してください。
          (6)配列namesの０番目と３番目の中身を表示してください。

		 */
		
		int[] numbers = new int[3];
		
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		
		String[] names = new String[5];
		
		names[0] = "のび太";
		names[1] = "すねお";
		names[2] = "ジャイアン";
		names[3] = "しずかちゃん";
		names[4] = "出木杉君";
		
		System.out.println(numbers[2]);
		System.out.println(names[0]);
		System.out.println(names[3]);
	}

}
