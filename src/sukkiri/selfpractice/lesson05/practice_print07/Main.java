package sukkiri.selfpractice.lesson05.practice_print07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
//	※配列を使ってください
//	メソッド名： weather
//	引数：なし
//	戻り値の型： String
//	処理の内容： 天気予報メッセージをランダムに生成して、そのメッセージを返す。
//	天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
//	{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
//	例：明日の天気は雨でしょう。
//	ヒント：引数なしなので、メソッド呼び出し時に渡す値はありません。
//	配列の宣言はweatherメソッドの中で行います。
	
	public static String weather() {
		
		Random rand = new Random();
		
		List<String> day = new ArrayList<>();
		day.add("今日");
		day.add("明日");
		day.add("明後日");
		day.add("明々後日");
		
		List<String> tenki = new ArrayList<>();
		tenki.add("晴れ");
		tenki.add("曇り");
		tenki.add("雨");
		tenki.add("大雨");
		tenki.add("大雪");
		tenki.add("雪");
		tenki.add("雷");
		tenki.add("雹");
		tenki.add("霙");
		tenki.add("霰");
		tenki.add("霧");
		tenki.add("台風");
		
		int dayr = rand.nextInt(4);
		int tenkir = rand.nextInt(12);
		
		String yohou = day.get(dayr) + "の天気は" + tenki.get(tenkir) + "でしょう。";
		
		return yohou;
	}
	
	public static void main(String[] args) {
		
		String msg = weather();
		System.out.println(msg);
	}


}
