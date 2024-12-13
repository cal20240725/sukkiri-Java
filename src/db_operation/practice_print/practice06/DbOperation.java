package db_operation.practice_print.practice06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	//insertメソッド
	//引数はKakeibo型(Kakeiboインスタンス)、戻り値はint型
	public int insert(Kakeibo kakeibo) {
		//int型変数countを用意する
		int count = 0;
		// SQL 文の作成
		String sql = "INSERT INTO 家計簿 VALUES(?, ?, ?, ?, ?)";

		try (// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			//プレースホルダーに値をセットする
			//java.sql.Dateが必要→日付のlong値が必要→日付はjava.util.Date
			//①kakeiboインスタンスのフィールド変数colDateをlong値に変換
			long long_date = kakeibo.getColDate().getTime();
			//②long値を使って、java.sql.Dateインスタンスを生成
			java.sql.Date sql_date = new java.sql.Date(long_date);
			//③java.sql.DateのインスタンスをsetDateの第2引数に渡す
			pstmt.setDate(1, sql_date);
			//pstmt.setDate(1, new java.sql.Date(kakeibo.getColDate().getTime()));
			pstmt.setString(2, kakeibo.getColItem()); //第1引数は何番目の?かを指定する
			pstmt.setString(3, kakeibo.getColMemo()); //第1引数は何番目の?かを指定する
			pstmt.setInt(4, kakeibo.getColDeposit());
			pstmt.setInt(5, kakeibo.getColWithdrawal());
			
			//SQL の実行し、戻り値をcount変数に代入
			count = pstmt.executeUpdate();
			

		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}
		return count;
	}

}
