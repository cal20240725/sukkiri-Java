package Comparator.practice.comparator.practice03;

public class Employee {
	//フィールド
	private String name;
	private double salary;
	
	//コンストラクタ
	public Employee(String name, double salary) {
		//引数を2つ受け取り、フィールドにセット
		this.name = name;
		this.salary = salary;
	}
	
	//toStringメソッド
	////オーバーライドして、実装する
	@Override
	public String toString() {
		//文字列を作成し、その文字列を返す
		return "Employee: name = " + this.name + "    " + "salary = " + this.salary;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
