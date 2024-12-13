package sukkiri.practice.practice_print07.practice02;

public class Day {
	//フィールド
	private int year;
	private int month;
	private int day;
	
	//引数が3つのコンストラクタ
	public Day(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		//まとめてセットするsetメソッドの呼び出し
//		set(year, month, day);
		
		//個々のセッターを呼び出してフィールドにセット
//		setYear(year);
//		setMonth(month);
//		setDay(day);
	}
	
	//getter
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	//setter
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//showCreateDateメソッド
	public void showCreateDate() {
		System.out.println("口座作成日は" + this.year + "年" + this.month + "月" + this.day + "日です。");
	}

}
