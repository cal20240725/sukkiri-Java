package sukkiri.practice.practice_print05.practice05;

public class Main {
	/*
	 *メソッド名:printMin
	 *引数:double a, double b, double c
	 *戻り値:なし
	 *処理:引数で渡された a, b, c の値のうち、最小値を出力する
	 */
	public static void printMin(double a, double b, double c) {
		/*
		double min = Integer.MAX_VALUE;
		if (a < min) {
			min = a;
		}
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		*/
		
		/*
		double min = a;
		
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		*/
		
		/*
		double min = Math.min(a, b);
		min = Math.min(min, c);
		*/
		
		double min = Math.min(Math.min(a, b), c);
		
		System.out.println("最小値は" + min);
	}

	public static void main(String[] args) {

		printMin(1, 2, 3);
	}

}
