package sukkiri.lesson05.code13;

public class Main {
	//int型配列を受け取り、配列内の要素すべてに1を加えるメソッド
	public static void incArray(int[] array) {//結果をreturnで返していない
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);//メソッドを実行
		for (int i : array) {     //arrayの
			System.out.println(i);//全要素を出力
		}
	}
}
