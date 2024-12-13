package sukkiri.practice.practice_print05.practice07;

import java.util.Random;

public class Main {
	/*
	 *メソッド名:weather
	 *引数:なし
	 *戻り値:String
	 *処理:天気予報メッセージをランダムに生成して、そのメッセージを返す。
     *天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
     *{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。
	 */
	public static String weather() {
		Random rand = new Random();
		
		String[] day = {"今日", "明日", "明後日"};
		String[] weather = {"晴れ", "曇り", "雨", "雪"};
		
		int d = rand.nextInt(3);
		int w = rand.nextInt(4);
		
		String yohou = day[d] + "の天気は" + weather[w] + "でしょう。";
		
		//System.out.println(yohou);
		
		return yohou;
	}
	
	public static void main(String[] args) {
		
		String msg = weather();
		System.out.println(msg);
	}

}
