package sukkiri.practice.practice_print11.practice04;

public class Main {
	public static void main(String[] args) {
		//Circleクラスのインスタンスを生成し、5.0をコンストラクタに渡す
		Circle circle = new Circle(5.0);
		//Rectangleクラスのインスタンスを生成し、4.0と6.0をコンストラクタに渡す
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		
		//各インスタンスのcalculateAreaメソッドを呼び出し、面積を表示する
		System.out.println("Circle Area   :" + circle.calculateArea());
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		
	}

}
