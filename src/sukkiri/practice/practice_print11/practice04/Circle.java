package sukkiri.practice.practice_print11.practice04;

public class Circle implements Shape{
	//フィールド
	double radius;
	
	//引数1つのコンストラクタ
	public Circle(double radius) {
		//引数を1つ受け取り、フィールドにセット
		this.radius = radius;
	}
	
	//インタフェースからオーバーライドして、実装する。処理内容は円の面積を返す
	@Override
	public double calculateArea() {
		return this.radius * this.radius * 3.14;
//		return this.radius * this.radius * Math.PI;
	}

}
