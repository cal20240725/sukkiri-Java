package sukkiri.practice.practice_print12.practice01;

public class Rectangle extends Shape { //Shapeクラスを継承
	//フィールド
	double width;
	double height;
	
	//引数2つのコンストラクタ
	public Rectangle(double width, double height) {
		//引数を2つ受け取り、フィールドにセット
		this.width = width;
		this.height = height;
	}
	
	//親クラスからオーバーライドして、実装する
	@Override
	public double calculateArea() {
		//処理内容は長方形の面積を返す
		return this.height * this.width;
	}

}
