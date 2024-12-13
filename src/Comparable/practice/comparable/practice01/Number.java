package Comparable.practice.comparable.practice01;

public class Number implements Comparable<Number>{
	//フィールド
	private int value;
	
	//コンストラクタ
	public Number(int value) {
		this.value = value;
	}
	
	//compareToメソッド
	//オーバーライドして、実装する
	@Override
	public int compareTo(Number otherNumber) {
		//自身のクラスのインスタンスを受け取り、フィールド変数の差を返す
		return this.value - otherNumber.value;
	}
	
	//getter
	public int getValue() {
		return this.value;
	}
	
	//setter
	public void setValue(int value) {
		this.value = value;
	}

}
