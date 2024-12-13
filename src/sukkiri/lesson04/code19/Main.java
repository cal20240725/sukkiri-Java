package sukkiri.lesson04.code19;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] scores = {{40, 50, 60,}, {80, 60, 70}};
		System.out.println("scores.length:" + scores.length);
		System.out.println("scores[0].length:" + scores[0].length);


		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |
		//| scores[1][0] | scores[1][1] | scores[1][2] |
		//|      80      |      60      |      70      |

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j] + " ");
			}
			System.out.println();
		}


		int[][] scores = {{40, 50, 60,}, {80, 60, 70, 90, 100}, {10, 20}};
		System.out.println("scoresの要素数" + scores.length);
		System.out.println("scores[0]の要素数" + scores[0].length);
		System.out.println("scores[1]の要素数" + scores[1].length);
		System.out.println("scores[2]の要素数" + scores[2].length);


		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |
		//| scores[1][0] | scores[1][1] | scores[1][2] | scores[1][3] | scores[1][4] |
		//|      80      |      60      |      70      |      90      |     100      |
		//| scores[2][0] | scores[2][1] |
		//|      40      |      50      |

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				//System.out.println("% - 3d",scores[i][j]);
				System.out.println(scores[i][j] + " ");
			}
			System.out.println();
		}



	}

}
