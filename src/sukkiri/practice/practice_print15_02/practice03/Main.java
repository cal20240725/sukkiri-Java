package sukkiri.practice.practice_print15_02.practice03;

public class Main {
	public static void main(String[] args) {
		/*
		下記表は各都市の１月の平均気温です。
		各国を要素の値に持つString型の配列cityと、
		各気温を要素の値に持つdouble型の配列temperatureを作り、
		実行結果のような表示をしてください。
		Tokyo	Canberra	Washington	Anchorage	Whitehorse
		 4.9	 21.44	       0.35	      -8.34	       -15.3
		 
		 実行結果例
          Tokyo      ：  4.90
          Canberra   ： 21.44
          Washington ：  0.35
          Anchorage  ： -8.34
          Whitehorse ：-15.30

		*/
		
		//配列の作成
		String[] city = {"Tokyo", "Canberra", "Washington", "Anchorage", "Whitehorse"};
		double[] temperature = {4.9, 21.44, 0.35, -8.34, -15.3};
		
		//書式指定文字列の作成
		final String FORMAT = "%-11s: %6.2f";//.2は少数第2位まで表示という意味
		
		//プレースホルダに値を代入＆表示
		for (int i = 0; i < city.length; i++) {
			//プレースホルダに値を代入
			String s = String.format(FORMAT, city[i], temperature[i]);
			//表示
			System.out.println(s);
		}

	}

}
