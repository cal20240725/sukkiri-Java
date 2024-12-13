package sukkiri.lesson16.code05;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		//TreeSetインスタンス(自然順序付け)の作成
		Set<String> words = new TreeSet<String>();
		
		//LinkedHashSetインスタンス(格納順)の作成
		//Set<String> words = new LinkedHashSet<String>();
		
		//要素の追加
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		//要素数を表示
		for (String s : words) {
			System.out.print(s + "→");
		}
	}

}
