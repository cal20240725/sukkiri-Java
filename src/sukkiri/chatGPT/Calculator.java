package sukkiri.chatGPT;

public class Calculator {
	// Loggerのインスタンス
	private Logger logger;

	// コンストラクタでLoggerを受け取る
	public Calculator(Logger logger) {
		this.logger = logger;
	}

	// 割り算を行うメソッド
	public int divide(int numerator, int denominator) {
		 // 割る数が0の場合はエラーを記録し、例外をスロー
		if (denominator == 0) {
			logger.log("error: Please enter a non-zero integer.");
			throw new IllegalArgumentException("Please enter a non-zero integer.");
		}
		 // 割り算の結果を返す
		return numerator / denominator;
	}
	/*
	概要
	Calculatorクラスは、割り算のロジックを担当します。このクラスは、数値の検証と実際の計算を行います。

	主なメソッド
	コンストラクタ:
	Loggerのインスタンスを受け取り、エラーや計算結果をログに記録するために使用します。
	
	divideメソッド:
	引数として受け取った二つの整数（割られる数と割る数）を使って割り算を行います。
	割る数が0の場合、IllegalArgumentExceptionをスローし、エラーメッセージをLoggerに記録します。
	割り算が成功した場合、計算結果を返します。
	
	データの流れ
	ユーザーが入力した二つの整数が渡されます。
	割る数が0でないかを確認し、適宜エラーを処理します。
	有効な入力であれば、割り算の結果を計算し、返します。
	*/

}
