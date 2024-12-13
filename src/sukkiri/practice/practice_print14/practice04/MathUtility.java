package sukkiri.practice.practice_print14.practice04;

public class MathUtility {
	//フィールド(定数)
	public static final double PI = 3.14159265359;
	
	//double型引数2つを受け取り、それらを加えた値を返す
	public static double add(double a, double b) {
		return a + b;
	}
	
	//double型引数2つを受け取り、第1引数から第2引数を引いた値を返す
	public static double substract(double a, double b) {
		return a - b;
	}
	
	//double型引数2つを受け取り、それらを掛けた値を返す
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	//double型引数2つを受け取り、第1引数を第2引数で割った値を返す
	//ただし、第2引数に0を受け取った場合は以下を記述し、例外処理をする
	public static double divide(double a, double b) {
		if(b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}		
		return a / b;
	}

}
