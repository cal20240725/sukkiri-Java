package sukkiri.chatGPT;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
	// ログファイルのパス
	private String logFile;

	 // コンストラクタでログファイルを指定
	public Logger(String logFile) {
		this.logFile = logFile;
	}

	// メッセージをログファイルに記録するメソッド
	public void log(String message) {
		// 現在の日付とメッセージをファイルに書き込む
		try (PrintWriter logWriter = new PrintWriter(new FileWriter(logFile, true))) {
			logWriter.println(new Date() + ": " + message);
			 // エラーが発生した場合はスタックトレースを表示
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	概要
	Loggerクラスは、ログメッセージをファイルに書き込むための機能を提供します。
	このクラスは、アプリケーションの状態やエラーメッセージを記録し、後で確認できるようにします。

	主なメソッド
	コンストラクタ:
	ログファイルのパスを受け取り、インスタンス変数として保存します。
	
	logメソッド:
	引数として受け取ったメッセージをログファイルに書き込みます。
	現在の日付と時間をメッセージに追加して記録します。
	ファイル書き込み時にIOExceptionが発生した場合は、エラーをスタックトレースとして表示します。
	
	データの流れ
	メッセージがlogメソッドに渡されます。
	現在の日時を取得し、メッセージに追加します。
	ログファイルにメッセージを書き込み、エラーが発生した場合は適切に処理します。
	*/

}
