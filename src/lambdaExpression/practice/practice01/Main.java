package lambdaExpression.practice.practice01;

interface Calculator {
	int calculate(int a, int b);
}

public class Main {
	public static void main(String[] args) {
		//匿名クラス
		//匿名クラスを用いて、Calculator型変数additionAnonymousに代入
		Calculator additionAnonymous = new Calculator() {
			//オーバーライドの内容は引数で受け取った2数の和を返す
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		};
		
		//匿名クラスを用いて、Calculator型変数subtractionAnonymousに代入
		Calculator subtractionAnonymous = new Calculator() {
			//オーバーライドの内容は引数で受け取った2数の差を返す(差は第1引数から第2引数を引いたものとする)
			@Override
			public int calculate(int a, int b) {
				return a - b;
			}
		};
		
		//ラムダ式
		//ラムダ式を用いて、Calculator型変数additonLambdaに代入
		//オーバーライドの内容は引数で受け取った2数の和を返す
		Calculator additionLambda = (int a, int b) -> {return a + b;};
		
		//ラムダ式を用いて、Calculator型変数subtractionLambdaに代入
		//オーバーライドの内容は引数で受け取った2数の差を返す(差は第1引数から第2引数を引いたものとする)
		Calculator subtractionLambda = (int a, int b) -> {return a - b;};
		//省略した書き方
		//Calculator subtractionLambda = (a, b) -> a - b;
		
		//オーバーライドしたインスタンスメソッドを呼び出して変数に代入
		//匿名クラスを用いた各インスタンスのcalculateメソッド
		//戻り値が和であるものを変数resultAdditonAnonymousに代入する
		int resultAdditonAnonymous = additionAnonymous.calculate(10, 5);
		//戻り値が差であるものを変数resultSubtractionAnonymousに代入する
		int resultSubtractionAnonymous = subtractionAnonymous.calculate(10, 5);
		
		//ラムダ式を用いた各インスタンスのcalculateメソッド
		//戻り値が和であるものを変数resultAdditionLambdaに代入する
		int resultAdditionLambda = additionLambda.calculate(20, 5);
		//戻り値が差であるものを変数resultSubtractionLambdaに代入する
		int resultSubtractionLambda = subtractionLambda.calculate(20, 5);
		
		//コンソールに出力
		//匿名クラス
		System.out.println("AdditonAnonymous     : " + resultAdditonAnonymous);
		System.out.println("SubtractionAnonymous : " + resultSubtractionAnonymous);
		
		////ラムダ式
		System.out.println("AdditionLambda       : " + resultAdditionLambda);
		System.out.println("SubtractionLambda    : " + resultSubtractionLambda);
		
	}

}
