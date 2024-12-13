package sukkiri.practice.practice_print14.practice04;

public class Main {
	public static void main(String[] args) {
		//MathUtilityクラスからフィールド、メソッドを呼び出し、表示する
		System.out.println("PI: " + MathUtility.PI);
		
		System.out.println("3 + 5 = " + MathUtility.add(3, 5));
		
		System.out.println("10 - 4 = " + MathUtility.substract(10, 4));
		
		System.out.println("2 * 6 = " + MathUtility.multiply(2, 6));
		
		System.out.println("8 / 2 = " + MathUtility.divide(8, 2));
		
	}

}
