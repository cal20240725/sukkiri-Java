package sukkiri.lesson15.code09;

public class Main {
	public static void main(String[] args) {
		
		//Heroクラスのインスタンスを生成
		Hero hero = new Hero();
		//fieldに値をセット
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;
		
	//	String.format("%d日で%sわかる%s入門", 3, "スッキリ", "Java");
		
		//書式指定文字列を定数FORMATに代入
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		//String.formatメソッドの第一引数に定数を渡し、それをString型に代入
		String s = String.format(FORMAT, hero.getName(), hero.getJob(),hero.getGold());
		System.out.println(s);
		
		System.out.println("---------------------------------------------");
		System.out.printf(FORMAT + "\n", hero.getName(), hero.getJob(),hero.getGold());
		
		System.out.println("=============================================");
		
	//	System.out.printf(FORMAT, "sugawara", "manager", 100);
		
		/*
		System.out.println("=============================================");
		//System.out.printf();
		System.out.printf("製品番号%s-%02d", "SJV", 3);
		*/
		
		//可変長引数の呼び出し
		aaa(1);
		aaa(1, 2, 3, 4, 5);
	}
	
	//可変長引数をもつメソッド
	public static void aaa(int... a) {
		
	}

}
