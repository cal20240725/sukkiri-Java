package variousClass.annonymous.example02;

//自作のインタフェース Calculator
interface Calculator {
	int calculate(int a, int b);
}

public class Main {
	public static void main(String[] args) {
		// メソッドに匿名クラスを引数として渡す例
		arithmeticCalculate ( new Calculator() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		});
		
		arithmeticCalculate ( new Calculator() {
			@Override
			public int calculate(int a, int b) {
				return a - b;
			}
		});
		
	}
	
	// メソッドの引数として匿名クラスを受け取る例
	public static void arithmeticCalculate (Calculator calculator) {
		int result = calculator.calculate(10, 5);
		System.out.println("Result: " + result);
	}

}
