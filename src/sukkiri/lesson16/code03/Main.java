package sukkiri.lesson16.code03;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		//HashSetインスタンスの作成
		Set<String> colors = new HashSet<String>();
		//要素の追加
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");//重複して「赤」を格納しようとしても無視される
		//要素数を表示
		System.out.println("色は" + colors.size() + "種類");
		
		
		//各要素を取得
		for (String s : colors) {
			System.out.println(s);
		}
	}

}
