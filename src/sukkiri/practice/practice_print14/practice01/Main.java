package sukkiri.practice.practice_print14.practice01;

public class Main {
	public static void main(String[] args) {
		//Vectorクラスのインスタンスを生成し、3.0と4.0をコンストラクタに渡す
		Vector vector = new Vector(3.0, 4.0);
		
		//インスタンスのtoStringメソッドを呼び出し、表示する
		System.out.println(vector.toString());
		System.out.println(vector); //これでも呼び出せる
		
	}

}
