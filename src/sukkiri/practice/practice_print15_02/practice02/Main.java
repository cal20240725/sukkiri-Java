package sukkiri.practice.practice_print15_02.practice02;

public class Main {
	public static void main(String[] args) {
		/*
		下記表は各国の人口です。
		各国を要素の値に持つString型の配列countryと、
		各人口を要素の値に持つint型の配列populationを作り、
		実行結果のような表示をしてください。
		  Japan	    Australia	United States	   China	 Brazil
		126500000	 25500000	  331000000 	1448500000	215400000

		実行結果例
		Japan         ：   126,500,000
		Australia     ：    25,500,000
		United States ：   331,000,000
		China         ： 1,448,500,000
		Brazil        ：   215,400,000
		*/
		
		//配列の作成
		String[] country = {"Japan", "Australia", "United States", "China", "Brazil"};
		int[] population = {126500000, 25500000, 331000000, 1448500000, 215400000};
		
		//書式指定文字列の作成
		final String FORMAT = "%-14s: %,14d";
		
		//プレースホルダに値を代入＆表示
		for (int i = 0; i < country.length; i++) {
			//プレースホルダに値を代入
			String s = String.format(FORMAT, country[i], population[i]);
			//表示
			System.out.println(s);
		}
		
		System.out.println("------------------------------------");
		
		for (int i = 0; i < country.length; i++) {
			System.out.printf(FORMAT + "\n", country[i], population[i]);
		}

	}

}
