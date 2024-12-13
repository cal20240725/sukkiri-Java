package sukkiri.lesson05.code12;

public class Main {
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {//引数に配列型を指定
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);//配列を渡す
		System.out.println("array in main method:" + array);//p158
	}
	/*
	 //値渡し 
	  public static void aaa(int x) {
	  	x++;
	  }

	  //参照渡し
	  public static void aaray(int[] array) {
	  	System.out.println("arrayのアドレス：" + array);
	  	array[0]++;
	  }

	 */




}
