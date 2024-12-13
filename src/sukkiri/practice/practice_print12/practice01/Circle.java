package sukkiri.practice.practice_print12.practice01;

public class Circle extends Shape { //Shapeクラスを継承
	//フィールド
	double radius;
	
	//引数1つのコンストラクタ
	public Circle(double radius) {
		//引数を1つ受け取り、フィールドにセット
		this.radius = radius;
	}
	
	//親クラスからオーバーライドして、実装する
	@Override
	public double calculateArea() {
		//処理内容は円の面積を返す
		return this.radius * this.radius * Math.PI;
	}

}
