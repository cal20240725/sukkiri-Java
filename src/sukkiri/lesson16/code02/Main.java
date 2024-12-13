package sukkiri.lesson16.code02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		//ArrayLisatの作成
		ArrayList<String> names = new ArrayList<String>();
		//List<String> names = new ArrayList<>();

		//ArrayListに要素を格納
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		//Iteratorの作成
		Iterator<String> it = names.iterator();
		//while文で各要素を見ていく
		while (it.hasNext()) {//矢印を次に進められるなら繰り返す
			//next()で次の要素を取得
			String e = it.next();//矢印を次に進め、内容を取り出す
			System.out.println(e);
		}

		//|   0  |   1   |   2   |
		//|  湊  |  朝香 |  菅原 |
		//   ↑

		System.out.println("→");
		for (String s : names) {
			System.out.println(s);
		}
		/*
		printList(names);

		LinkedList<String> linked = new LinkedList<>();

		//printList(linked);


	public static void printList(ArrayList<String> list) {

	}
		 */

	}

}
