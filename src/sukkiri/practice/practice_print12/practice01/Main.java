package sukkiri.practice.practice_print12.practice01;

public class Main {
	public static void main(String[] args) {
		//要素数が2のShape型配列を生成する
		Shape[] shape = new Shape[2];
		
		//Circleクラスのインスタンスを生成し、5.0をコンストラクタに渡す
		Circle circle = new Circle(5.0);
		
		//Rectangleクラスのインスタンスを生成し、4.0と6.0をコンストラクタに渡す
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		
		//上記のインスタンス2つを配列に代入する
		shape[0] = circle;
		shape[1] = rectangle;
		
		//for文を用いて、各インスタンスのcalculateAreaメソッドを呼び出し、面積を表示する
		for(int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].calculateArea());
		}
		
	}

}
