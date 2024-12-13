package sukkiri.lesson15.code04;

public class Main {
	public static void main(String[] args) {
		
		//StringBuilderインスタンスの生成
		StringBuilder sb = new StringBuilder();
		
		//long start_1 = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");//①バッファにJavaを追加
		}
		
		//long finish_1 = System.currentTimeMillis();
		
		//System.out.println("StringBuilderの処理時間:" + (finish_1 - start_1));
		
		//②完成した連結済み文字列を取り出す
		String s = sb.toString();//toStringメソッドを用いて、String型に変換
		System.out.println(s);
	//	System.out.println(sb.toString());
	//	System.out.println(sb);
		
		/*
		String ss = null;
		long start_2 = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++){
			ss += "Java";
		}
		
		long finish_2 = System.currentTimeMillis();
		
		System.out.println("+演算子の処理時間:" + (finish_2 - start_2));
		*/
		
		
		
		/*
		String str = "aaa";
		
		str = str + "bbb";
		
		System.out.println("str:" + str);
		*/
		
		String str = "abc";//p533-534
		System.out.println("str:" + str);
		String str_1 = str.replace("a", "A");
		//str.replace("a", "A");
		System.out.println("after calling replace method");
		System.out.println("str:" + str);
		System.out.println("str_1:" + str_1);
		
		/*
		 String s = sb.toString();
		 
		 System.out.println(sb);
		 */
		 
		 String sss = "a";
		 sss = sss + "b";
		 sss = sss + "c";
		 
	}

}
