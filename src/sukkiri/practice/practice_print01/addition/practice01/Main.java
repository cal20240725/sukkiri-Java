package sukkiri.practice.practice_print01.addition.practice01;

public class Main {
	public static void main(String[] args) {
		
//		int型の変数ｘに数値5を代入して、ｘの値を2乗、3乗した結果を
//		コンソール画面に表示しましょう。
//		int z = Math.pow(①,②);を使う。
//		①	繰り返し掛け算する数。　②何回かけ合わせたかを表す数
//		実行結果
//		ｘの2乗：25
//		ｘの3乗：125
		
		int x = 5;
		
		int z = (int) Math.pow(x, 2);
		
		System.out.println("ｘの2乗：" + z);
		
		z = (int) Math.pow(x, 3);
		
		System.out.println("ｘの3乗：" + z);

	}

}
