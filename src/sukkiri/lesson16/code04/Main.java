package sukkiri.lesson16.code04;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		//HashSetインスタンスの作成
		Set<String> colors = new HashSet<String>();
		//要素の追加
		colors.add("赤");
		colors.add("青");//赤・青・黄の順に格納
		colors.add("黄");
		//要素数を表示
		for (String s : colors) {
			System.out.print(s + "→");
		}
	}

}
