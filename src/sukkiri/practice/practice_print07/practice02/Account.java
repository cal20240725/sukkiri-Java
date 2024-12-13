package sukkiri.practice.practice_print07.practice02;

public class Account {
	//フィールド
	private String name;
	private String num;
	private int balance;
	private Day day;
	
	//引数が6つのコンストラクタ
	public Account(String name, String num, int balance, int year, int month, int day) {
		this.name = name;
		this.num = num;
		this.balance = balance;
		this.day = new Day(year, month, day);
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public String getNum() {
		return this.num;
	}
	public int getBalance() {
		return this.balance;
	}
	public Day getDay() {
		return this.day;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setDay(int year,int month,int day) {
		this.day.setYear(year);
		this.day.setMonth(month);
		this.day.setDay(day);
		
		//Dayクラスのインスタンスメソッドであるsetを使う方法
//		this.day.set(year, month, day);
	}
	
	//depositメソッド
	public void deposit(int add) {
		this.balance += add;
	}
	
	//withdrawメソッド
	public void withdraw(int sub) {
		this.balance -= sub;
	}
	
	//showAccountメソッド
	public void showAccount() {
		System.out.println("口座名義：" + this.name);
		System.out.println("口座番号：" + this.num);
		System.out.println("預金額：" + this.balance);
		this.day.showCreateDate();
	}

}
