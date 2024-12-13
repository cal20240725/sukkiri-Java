package db_operation.practice_print.practice07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kakeibo {
	//フィールド
	//家計簿テーブルの列数だけ用意する ※日付はjava.util.Date型
	private Date colDate;
	private String colItem;
	private String colMemo;
	private int colDeposit;
	private int colWithdrawal;

	//コンストラクタ
	public Kakeibo(Date colDate, String colItem, String colMemo, int colDeposit, int colWithdrawal) {
		//引数で家計簿テーブルの各列の情報を受け取り、それをフィールドにセットする
		this.colDate = colDate;
		this.colItem = colItem;
		this.colMemo = colMemo;
		this.colDeposit = colDeposit;
		this.colWithdrawal = colWithdrawal;
	}

	//formatterメソッド
	public String formatter(Date colDate) {
		//引数はDate型を受け取り、それを書式が「yyyy-MM-dd」の文字列に変換し、返す
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sdf.format(colDate);
		return strDate;
	}

	//showメソッド
	public void show() {
		//引数、戻り値なしで、formatterメソッドを呼び出す
		System.out.println("======================");
		String strDate = formatter(getColDate());
		System.out.println("日付  ：" + strDate);
		System.out.println("費目  ：" + getColItem());
		System.out.println("メモ  ：" + getColMemo());
		System.out.println("入金額：" + getColDeposit());
		System.out.println("出金額：" + getColWithdrawal());
	}

	//getter
	public Date getColDate() {
		return this.colDate;
	}
	public String getColItem() {
		return this.colItem;
	}
	public String getColMemo() {
		return this.colMemo;
	}
	public int getColDeposit() {
		return this.colDeposit;
	}
	public int getColWithdrawal() {
		return this.colWithdrawal;
	}

	//setter
	public void setColDate(Date colDate) {
		this.colDate = colDate;
	}
	public void setColItem(String colItem) {
		this.colItem = colItem;
	}
	public void setColMemo(String colMemo) {
		this.colMemo = colMemo;
	}
	public void setColDeposit(int colDeposit) {
		this.colDeposit = colDeposit;
	}
	public void setColWithdrawal(int colWithdrawal) {
		this.colWithdrawal = colWithdrawal;
	}

}
