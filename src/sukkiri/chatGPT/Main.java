package sukkiri.chatGPT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 // Loggerクラスのインスタンスを生成し、ログファイルを指定
		Logger logger = new Logger("file\\app.log");
		 // アプリの開始をログに記録
		logger.log("***App has started.***");

		// ユーザーからの入力を受け取るためのScanner
		Scanner scanner = new Scanner(System.in);
		// Calculatorクラスのインスタンスを生成
		Calculator calculator = new Calculator(logger);
		boolean continueCalculation = true;

		 // 計算を繰り返すためのループ
		while (continueCalculation) {
			try {
				 // 割られる数の入力
				System.out.print("the first integer＞ ");
				int numerator = getIntInput(scanner);

				 // 割る数の入力
				System.out.print("the second integer(other than '0')＞ ");
				int denominator = getIntInput(scanner);

				 // 割り算を実行
				int result = calculator.divide(numerator, denominator);
				
				// 結果を表示
				System.out.println(numerator + " / " + denominator + " = " + result);

			} catch (InputMismatchException e) {
				// 入力が不正な場合
				logger.log("An error has occurred: null");
				System.out.println("An error has occurred: null");
				// 不正な入力をクリア
				scanner.nextLine(); 
			}

			// 計算を続けるかどうかを確認
			System.out.print("continue the calculation?[y / n]＞ ");
			String choice = scanner.next();
			continueCalculation = choice.equalsIgnoreCase("y");
		}
		 // アプリの終了をログに記録
		logger.log("***App will exit.***");
	}

	// 整数値の入力を取得するメソッド
	private static int getIntInput(Scanner scanner) {
		// 入力された整数を返す
		return scanner.nextInt();
	}
	/*
	概要
	Mainはプログラムのエントリーポイントであり、ユーザーとの対話を担当します。
	このクラスはユーザーからの入力を取得し、計算を実行し、結果やエラーメッセージを表示します。

	主なメソッド
	mainメソッド:
	プログラムの開始点です。このメソッド内で以下の処理が行われます。
	Loggerのインスタンスを作成し、アプリの開始をログに記録します。
	Scannerを使用してユーザーからの入力を受け取ります。
	Calculatorクラスをインスタンス化し、割り算の処理を行います。
	入力値に基づいて計算を実行し、結果を表示します。
	エラーが発生した場合は適切なメッセージを表示し、ログに記録します。
	計算を続けるかどうかの選択肢を提供します。
	
	データの流れ
	ユーザーが割られる数と割る数を入力します。
	入力が適切かどうかを検証し、適宜エラーメッセージを表示します。
	計算結果を表示し、必要に応じてログに記録します。
	*/

}
