package sukkiri.practice.practice_print04.practice10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 以下の手順で二次元配列のコードを作成してください。（簡易ビンゴカード作成）
         (1)5×5の形の二次元配列を宣言してください。（int型配列 変数名numbers)
         (2)二重for文で配列numbersの各要素に、乱数を用いて1～50の値をセットしてください。
          numbers[2][2]の時は0を代入し、それ以外のときは乱数の値を代入するように
          if文を使って記述すること。
         (3)二重for文を使い、numbersの配列をprintfを使い3桁指定で表示してください。
          if文を使って要素の値が0のときは☆を表示するようにしてください。
          整数値を表示はSystem.out.printf(“%3d”,a[][]);//a[][]には
          配列の添え字（インデックス）が入る
          ☆を表示時は、System.out.printf(“%2s”,”☆”);と書く
          
              実行結果例	              numbersの添え字（インデックス対応表）
          10  20    3   4  15            [0][0]	[0][1]	[0][2]	[0][3]	[0][4]
           5  40    6  18  10            [1][0]	[1][1]	[1][2]	[1][3]	[1][4]
           9  36   ☆  12  15            [2][0]	[2][1]	[2][2]	[2][3]	[2][4]
          19  28   12  36  20            [3][0]	[3][1]	[3][2]	[3][3]	[3][4]
          21  50   15   1  45            [4][0]	[4][1]	[4][2]	[4][3]	[4][4]
		 */
		
		Random rand = new Random();//乱数の発生
		/*
		int[][] numbers = new int[5][5];
		
		int num = rand.nextInt(50) + 1;
		
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (numbers[2][2] == 0) {
					numbers[2][2] = 0;
				} else {
					
				}
			}
		}
		*/
		
		//回答
		int[][] numbers = new int[5][5];
		for (int i = 0; i < numbers.length; i++) {//外側のfor文：行(親配列)に対応
			for (int j = 0; j < numbers[i].length; j++) {//内側のfor文：列(子配列)に対応
				if (i == 2 && j == 2) {//numbers[2][2]の時(i,jがともに2の時)
					numbers[i][j] = 0;
				} else {//numbers[2][2]の時以外
					numbers[i][j] = rand.nextInt(50) + 1;//乱数を用いて1～50の値をセット
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == 0) {//要素の値が0の時
					System.out.printf("%2s" , "☆");
				} else {//要素の値が0の時以外
					System.out.printf("%3d" , numbers[i][j]);//表示　P544
				}
			}
			System.out.println();
		}
		
		//int[] numbers = {100, 200, 300, 400, 500};
		//int[][] numbers = {{1, 2, 3, 4, 5} , {6, 7, 8, 9, 10} , {11, 12, 13, 14, 15} , {16, 17, 18, 19, 20} , {21, 22, 23, 24, 25}};
	}

}
