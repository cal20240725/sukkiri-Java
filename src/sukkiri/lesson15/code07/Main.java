package sukkiri.lesson15.code07;

public class Main {
	public static void main(String[] args) {
		
		String s = "abc,def:ghi";
		//戻り値はString型の配列なので、String型の配列に代入
		String[] words = s.split("[,:]");//正規表現パターン
		
		//拡張for文で、配列の要素を表示
		for (String w : words) {
			System.out.print(w + "->");
		}
	}

}
