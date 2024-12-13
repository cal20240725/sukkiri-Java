package sukkiri.practice.practice_print11.practice03;

public abstract class AbstLine extends Shape{ //Shapeクラスを継承した抽象クラス
	//フィールド
	private int length; //直線の幅
	
	//引数1つのコンストラクタ
	public AbstLine(int length) {
		//引数を1つ受け取り、setLengthメソッド(setter)に引数の値を渡す
		setLength(length);
	}
	
	//getter
	public int getLength() {
		return this.length;
	}
	
	//setter
	public void setLength(int length) {
		this.length = length;
	}

}
