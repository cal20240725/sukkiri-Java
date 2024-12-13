package db_operation.practice_print.practice05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class DbOperation {
	//フィールド
	//Connectionクラスの変数connを初期化せずに変数のみ設定する
	//URL、ユーザー名、パスワードを初期化せずに変数のみ設定する
	private Connection con;
	private String url;
	private String user;
	private String password;

	//コンストラクタ
	public DbOperation() {
		//引数なしで、フィールドのURL、ユーザー名、パスワードに値を代入する
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
	}

	//connectメソッド
	public void connect() {
		//戻り値、引数なしで、フィールド変数conに値を代入する ※例外処理が必要
		try {
			this.con = DriverManager.getConnection(url, user, password);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	//disconnectメソッド
	public void disconnect() {
		//戻り値、引数なしで、フィールド変数conがnullでないならconのcloseメソッドを呼び出す
		//※例外処理が必要
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} 
	}

	//selectメソッド
	//引数なし、戻り値はKakeibo型のArrayList
	public ArrayList<Kakeibo> select() {
		//Kakeibo型のArrayListを用意する
		ArrayList<Kakeibo> alk = new ArrayList<>();
		
		//引数、戻り値はなく、家計簿テーブルからすべての列を取得する
		try (Statement stmt = this.con.createStatement();) {

			// SQL 文の作成		
			String sql = "select * from 家計簿";

			// SQL 文を実行し、結果を ResultSet に格納する。
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {
				// 日付、費目、メモ、入金額、出金額を取得
				Date colDate = result.getTimestamp("日付");
				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				int colDeposit = result.getInt("入金額");
				int colWithdrawal = result.getInt("出金額");
				
				//家計簿テーブルからすべての列を取得し、Kakeiboコンストラクタの引数に渡す
				Kakeibo kakeibo = new Kakeibo(colDate, colItem, colMemo, colDeposit, colWithdrawal);
				//インスタンス化したものをArrayListに追加
				alk.add(kakeibo);
			}
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}
		//リストを返す
		return alk;
	}

}
