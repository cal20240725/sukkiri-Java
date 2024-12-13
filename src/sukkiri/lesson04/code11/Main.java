package sukkiri.lesson04.code11;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};
		
		//| scores[0] | scores[1] | scores[2] | scores[3] | scores[4] |
		//|    20     |    30     |    40     |    50     |    80     |
		
		//変数countを用意
		int count = 0;
		//for文で特定の条件の時countを増やす
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + "週目の要素" +scores[i]);
			if (scores[i] >= 50) {//i番目の要素が50以上の場合
				count++;//変数countをインクリメント
			}
		}
		System.out.println("50点以上の科目の数は:" + count);
	}

}
