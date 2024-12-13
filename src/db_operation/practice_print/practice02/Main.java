package db_operation.practice_print.practice02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	//フィールド
	//DBのURL、ユーザー名、パスワードを設定(static修飾子をつける)
	
	// DB の URL
	static String url = "jdbc:postgresql://localhost:5432/postgres";

	// DB のユーザー名
	static String user = "postgres";

	// DB のパスワード
	static String password = "postgrestest";
	
	//mainメソッド
	public static void main(String[] args) {
		//selectメソッドを呼び出す
		select();
	}

	//selectメソッド(static修飾子をつける)、引数、戻り値なし
	public static void select() {
		//データベースに接続し、「費目」「メモ」を取得し、コンソールに表示する
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {

			// SQL 文の作成		
			String sql = "select 費目, メモ from 家計簿";

			// SQL 文を実行し、結果を ResultSet に格納する。
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {
				// 費目、メモを取得
				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");

				// 表示
				System.out.println("=======================");
				System.out.println("費目：" + colItem);
				System.out.println("メモ：" + colMemo);
			}
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}
	}
	
}
