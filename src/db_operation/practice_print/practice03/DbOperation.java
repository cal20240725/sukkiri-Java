package db_operation.practice_print.practice03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperation {
	//フィールド
	//DBのURL、ユーザー名、パスワードを設定(private修飾子をつける)
	
	// DB の URL
	private String url = "jdbc:postgresql://localhost:5432/postgres";

	// DB のユーザー名
	private String user = "postgres";

	// DB のパスワード
	private String password = "postgrestest";

	//selectメソッド、引数、戻り値なし
	public void select() {
		//データベースに接続し、「費目」「メモ」「入金額」「出金額」を取得し、コンソールに表示する
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {

			// SQL 文の作成		
			String sql = "select 費目, メモ, 入金額, 出金額 from 家計簿";

			// SQL 文を実行し、結果を ResultSet に格納する。
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {
				// 費目、メモ、入金額、出金額を取得
				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				int colDeposit = result.getInt("入金額");
				int colWithdrawal = result.getInt("出金額");

				// 表示
				System.out.println("=======================");
				System.out.println("費目：" + colItem);
				System.out.println("メモ：" + colMemo);
				System.out.println("入金額：" + colDeposit);
				System.out.println("出金額：" + colWithdrawal);
			}
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}
	}

}
