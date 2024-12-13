package sukkiri.practice.practice_print14.practice01;

public class Vector {
	//フィールド
	private double x;
	private double y;
	
	//引数2つのコンストラクタ
	public Vector(double x, double y) {
		//引数を2つ受け取り、フィールドにセット
		this.x = x;
		this.y = y;
	}
	
	//オーバーライドして、文字列を返す
	@Override
	public String toString() {
		return "Vector: Vector(" + this.x + ", " + this.y + ")";
	}

}
