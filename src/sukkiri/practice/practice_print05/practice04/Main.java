package sukkiri.practice.practice_print05.practice04;

public class Main {
	/*
	 *メソッド名:printArea
	 *引数:double height, double width
	 *戻り値:なし
	 *処理:高さが height, 横幅が width の長方形の面積を出力する
	 */
	public static void printArea(double height, double width) {
		
		double ans = height * width;
		System.out.println("長方形の面積は" + ans);
	}
	
	public static void main(String[] args) {
		printArea(5, 6);
	}

}
