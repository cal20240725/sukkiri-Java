package db_operation.practice_print.practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		//DBのURL、ユーザー名、パスワードを変数に代入し、
		//家計簿テーブルから「費目」を取得し、コンソールに表示する

		// 接続文字列の設定
		// DB の URL
		String url = "jdbc:postgresql://localhost:5432/postgres";

		// DB のユーザー名
		String user = "postgres";

		// DB のパスワード
		String password = "postgrestest";

		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {

			// SQL 文の作成
			String sql = "select 費目 from 家計簿";

			// SQL 文を実行し、結果を ResultSet に格納する。
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {
				// 費目を取得
				String colItem = result.getString("費目");

				// 表示
				System.out.println(colItem);
			}
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}

	}

}
