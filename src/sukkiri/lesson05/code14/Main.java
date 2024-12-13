package sukkiri.lesson05.code14;

public class Main {
	public static int[] makeArray(int size) {//int型配列を作成して戻すメソッド
		int[] newArray = new int[size];//箱の個数が引数である配列を宣言(要素数が引数である配列の)
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]++;//i番目の箱(要素)に変数iを代入
		}
		System.out.println("newArray in makeArray method:" + newArray);//p158
		return newArray;//配列(変数名)を返す
	}
	
	public static void main(String[] args) {
		int[] array = makeArray(3);
		System.out.println("after calling makeArray method:" + array);//p158
		
		for (int i : array) {      //arrayの
			System.out.println(i);//全要素を出力
		}
		
		
		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
	}

}
