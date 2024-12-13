package sukkiri.practice.practice_print15_01.practice04;

public class Main {
	public static void main(String[] args) {
		/*下の方法で定義されたString型変数sに対し 1) ~ 5)
		  の内容を実行するプログラムを作成してください。
	      String s = " Let it go. " ;  // 「空白Let空白it空白go.空白」になっている
	      1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
	      2)  s に「t」の文字が何個存在しているか数を表示する。
          3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
	      4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する

                      実行結果例
                    1) Let it go.
                    2) 2
                    3) 3
                    4) Letitgo.
         */
		
		String s = " Let it go. ";
		
		// 1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
		String strTrim = s.trim();
		System.out.println(strTrim);
		//System.out.println(s.trim());
		
		// 2)  s に「t」の文字が何個存在しているか数を表示する。
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println(count);
		
		// 3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
		//下は間違い
		String[] str = strTrim.split(" ");
		System.out.println(str.length);
		System.out.println("--------------------------");
		for (String ss : str) {
		System.out.println(ss);
		}
		
		// 4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する
		StringBuilder sb = new StringBuilder();
		/*
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		*/
		
		for (String element : str) {
			sb.append(element);
		}
		System.out.println(sb);

	}

}
