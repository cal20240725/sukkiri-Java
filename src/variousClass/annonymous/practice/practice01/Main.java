package variousClass.annonymous.practice.practice01;

abstract class Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
}

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape() {
			//フィールド
			double radius = 5.0;
			
			//getAreaメソッド
			@Override
			public double getArea() {
				//半径をフィールド変数としたときの円の面積を返す
				return radius * radius * Math.PI;
			}
			
			//getPerimeter
			@Override
			public double getPerimeter() {
				//半径をフィールド変数としたときの円周を返す
				return (radius + radius) * Math.PI;
			}
		};
		
		//匿名クラスのメソッドを呼び出して、図形情報を表示する
		System.out.println("Circle Area: " + shape.getArea());	
		System.out.println("Circle Perimeter: " + shape.getPerimeter());

	}

}
