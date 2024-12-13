package db_operation.practice_print.practice04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbOperation {
	//フィールド
	//Connectionクラスの変数connを初期化せずに変数のみ設定する
	//URL、ユーザー名、パスワードを初期化せずに変数のみ設定する
	//SimpleDateFormat型の変数sdfを初期化せずに変数のみ設定する
	private Connection con;
	private String url;
	private String user;
	private String password;
	private SimpleDateFormat sdf;

	//コンストラクタ
	public DbOperation() {
		//引数なしで、フィールドのURL、ユーザー名、パスワードに値を代入する
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
		//SimpleDateFormatクラスのインスタンスを生成し、フィールド変数sdfに代入 ※書式は「yyyy-MM-dd」
		sdf = new SimpleDateFormat("yyyy-MM-dd");
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
	public void select() {
		//引数、戻り値はなく、家計簿テーブルからすべての列を取得し、コンソールに表示する
		try (Statement stmt = this.con.createStatement();) {

			// SQL 文の作成		
			String sql = "select * from 家計簿";

			// SQL 文を実行し、結果を ResultSet に格納する。
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {
				// 日付、費目、メモ、入金額、出金額を取得
				Date colDate = result.getTimestamp("日付");
				String strDate = this.sdf.format(colDate);
				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				int colDeposit = result.getInt("入金額");
				int colWithdrawal = result.getInt("出金額");

				// 表示
				System.out.println("=======================");
				System.out.println("日付：" + strDate);
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
