package lambdaExpression.example.example01;

//関数型インタフェースの定義
interface Calculator {
	double calculate(int x);
}

public class Main {
	public static void main(String[] args) {
		//インスタンス生成部分に匿名クラスを使用
		Calculator calcAnonymous = new Calculator() {
			@Override
			public double calculate(int x) {
				return Math.sqrt(x);
			}
		};
		
		//インスタンス生成部分にラムダ式を使用し、関数型インタフェースを実装
		Calculator calcLambda = x -> Math.sqrt(x);
		//省略しない書き方
		Calculator calcLambda2 = (int x) -> {return Math.sqrt(x);};
		
		double resultAnonymous = calcAnonymous.calculate(36);
		double resultLambda = calcLambda.calculate(100);
		
		System.out.println("resultAnonymous:" + resultAnonymous);
		System.out.println("resultLambda :" + resultLambda); 
	}
}

