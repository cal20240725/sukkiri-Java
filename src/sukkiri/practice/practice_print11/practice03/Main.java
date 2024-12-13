package sukkiri.practice.practice_print11.practice03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scannerを宣言する
		Scanner sc = new Scanner(System.in);

		//Shape型配列を要素4で宣言する
		Shape[] shape = new Shape[4];

		//配列の0番目には点(Point)クラスのインスタンスを格納
		Point point = new Point();
		shape[0] = point;
//		shape[0] = new Point(); //模範解答

		//配列の1番目には、キーボードからwidth（幅）とheight（高さ）を入力し、
		//インスタンスを生成し、長方形クラスのコンストラクタに値を渡してから格納する
		System.out.print("長方形の幅は：");
		int w = sc.nextInt();
		System.out.print("長方形の高さは：");
		int h = sc.nextInt();
		Rectangle rectangle = new Rectangle(w, h);
		shape[1] = rectangle;
//		shape[1] = new Rectangle(w, h); //模範解答

		//配列の2番目には、キーボードからhorzLength（水平直線の長さ）を入力し、
		//インスタンスを生成し、水平直線クラスのコンストラクタに値を渡してから格納する
		System.out.print("水平直線の長さは：");
		int hl = sc.nextInt();
		HorzLine horzline = new HorzLine(hl);
		shape[2] = horzline;
//		shape[2] = new HorzLine(hl); //模範解答
		
		//配列の3番目には、キーボードからvertLength（垂直直線の長さ）を入力し、
		//インスタンスを生成し、垂直直線クラスのコンストラクタに値を渡してから格納する
		System.out.print("垂直直線の長さは：");
		int vl = sc.nextInt();
		VertLine vertline = new VertLine(vl);
		shape[3] = vertline;
//		shape[3] = new VertLine(vl); //模範解答

		//Shape型配列の要素数でループ文を作り、drawメソッドを呼び出す
		for(int i = 0; i < shape.length; i++) {
			shape[i].draw();
		}

	}

}
