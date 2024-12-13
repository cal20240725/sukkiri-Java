package db_operation.practice_print.practice05;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//DbOperationインスタンスを生成
		DbOperation dbo = new DbOperation();
		
		//connectメソッドを呼び出す
		dbo.connect();
		
		//selectメソッドを呼び出し、Kakeibo型のArrayListに代入
		ArrayList<Kakeibo> alk = dbo.select();
		
		//すべての要素においてshowメソッドを呼び出す
		for(Kakeibo kakeibo : alk) {
			kakeibo.show();
		}
		
		//disconnectメソッドを呼び出す
		dbo.disconnect();
		
	}

}
