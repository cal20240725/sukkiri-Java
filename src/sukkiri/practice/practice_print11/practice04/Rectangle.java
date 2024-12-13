package sukkiri.practice.practice_print11.practice04;

public class Rectangle implements Shape {
	//フィールド
	double width;
	double heigtht;
	
	//引数2つのコンストラクタ
	public Rectangle(double width, double heigtht) {
		//引数を2つ受け取り、フィールドにセット
		this.width = width;
		this.heigtht = heigtht;
	}
	
	//インタフェースからオーバーライドして、実装する。処理内容は長方形の面積を返す
	@Override
	public double calculateArea() {
		return this.heigtht * this.width;
	}

}
