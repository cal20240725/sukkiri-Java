package Comparator.practice.comparator.practice02;

public class Student {
	//フィールド
	private String name;
	private int score;
	private int age;
	
	//コンストラクタ
	public Student(String name, int score, int age) {
		//引数を3つ受け取り、フィールドにセット
		this.name = name;
		this.score = score;
		this.age = age;
	}
	
	// toStringメソッド
	@Override
	public String toString() {
		//オーバーライドし、文字列を作成し、その文字列を返す
		String format = "";
		return "Student: name =" + this.name + " " +"score= " + this.score + " " + "age= " + this.age;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
