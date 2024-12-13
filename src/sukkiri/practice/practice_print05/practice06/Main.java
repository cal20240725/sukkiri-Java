package sukkiri.practice.practice_print05.practice06;

public class Main {
	/*
	 *メソッド名:getMin
	 *引数:double a, double b
	 *戻り値:double　(return文で三項条件演算子を使用して下さい (テキストp122参照))
	 *処理:引数で受け取る2つの値のうち、小さい方の値を返す
	 */
	public static double getMin(double a, double b) {
		/*
		double min = Integer.MAX_VALUE;
		
		if (a < min) {
			min = a;
		}
		if (b < min) {
			min = b;
		}
		*/
		
		double min = a < b ? a : b;
		
		//System.out.println("小さいのは" + min);
		
		return min;
		
		//return a < b ? a : b; 1行にまとめるとこうなる
		
		/*
		if (a < b) {
			return a;
		} else {
			return b;
		}
		*/
		
		/*
		if (a < b) {
			return a;
		}
		
		return b;
		*/
	}
	
	public static void main(String[] args) {
		
		double min = getMin(1, 2);
		System.out.println("小さいのは" + min);
	}

}
