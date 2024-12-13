package sukkiri.practice.practice_print04.practice04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//１週間の大阪市の最高気温です。配列を使用して平均気温を求め、表示しましょう。
		//気温を合計し、平均気温を求める際、気温の合計にはfor文を利用し、
		//lengthを使ってループ条件を書くこと。
		
		double[] kion = {33.2, 33.6, 34.9, 38.4, 34, 30.7, 27.5};
		
		double sum = 0;
		
		for (int i = 0; i < kion.length; i++) {
			sum += kion[i];
		}
		double avg = sum / kion.length;
		
		System.out.println("平均気温は" + avg + "度です。");
		System.out.printf("平均気温は%.1f度です。\n", avg);

	}

}
