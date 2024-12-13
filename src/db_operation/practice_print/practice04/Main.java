package db_operation.practice_print.practice04;

public class Main {
	public static void main(String[] args) {
		//DbOperationインスタンスを生成
		DbOperation dbo = new DbOperation();
		
		//selectメソッドを呼び出す
		//※DBに接続するたびに、connectメソッド、disconnectメソッドを呼び出す必要あり
		dbo.connect();
		dbo.select();
		dbo.disconnect();
	}

}
