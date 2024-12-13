package sukkiri.practice.practice_print05.addition.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static double getAverage(double[] array) {
//		メソッド名： getAverage
//		引数：double[] array
//		戻り値の型：double
//		処理の内容： 引数で受け取る配列の要素の平均値を呼び出し元のmainメソッドに返す。
		
		//和を格納する変数の初期化
		double sum = 0;
		
		//和を求める処理
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		//平均の算出
		double avg = sum / array.length;
		
		//平均値を返す
		return avg;
	}
		public static void printAry(double[] d) {
//			メソッド名：printAry
//			引数：double[] d
//			戻り値の型：なし
//			処理の内容：引数で受け取った配列を拡張for文で全て表示する。
//					　　　「乱数値は〇〇〇です」という形で出力表示する。
			
			for (double db : d) {
				System.out.println("乱数値は" + db + "です");
			}
			
		}
		
		public static double[] getAry(int a) {
//			メソッド名：getAry
//			引数：int a
//			戻り値の型：double[]
//			処理の内容：①引数で受け取ったint型変数aの要素数のdouble型配列を宣言する。
//					    ②for文と乱数を使い、配列の各要素に0.0～1.0の間の値を代入する。
//					    ③printAryメソッドに配列を引数として渡しメソッドを呼び出す。
//			            ④配列を戻り値として返す。
			
			Random rand = new Random();
			
			double[] num = new double[a];
			
			for (int i = 0; i < num.length; i++) {
				double dou = rand.nextDouble();
				num[i] = dou;
			}
			
			printAry(num);
			
			return num;
		}
		
		public static void main(String[] args) {
//			メソッド名：main
//			引数：String[] args
//				　戻り値：なし
//			処理の内容：①int型変数nを宣言し、キーボードから入力を行う。
//			②変数nをgetAryメソッドに引数として渡し、戻り値を受け取る。
//			③getAverageメソッドに②で受け取った戻り値を引数として渡し、戻り値を受け取る。
//			④「平均値は（③の戻り値）です」という形で表示する。
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("要素数を入力＞");
			int n = sc.nextInt();
			
			double[] ad = getAry(n);
			
			double avg = getAverage(ad);
			
			System.out.println("平均値は" + avg + "です");
		}


}
