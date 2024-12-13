package sukkiri.lesson16.code07;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		//HashMapインスタンスの作成
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		//ペアの追加
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);
		
		//各ペア(要素)を取得し、表示
		//keySetメソッド：Mapのkeyを要素とするSetを返す
		for (String key : prefs.keySet()) {//県名一覧を取得し繰り返す
			int value = prefs.get(key);//県名(キー)を指定し人口(値)を取得
			System.out.println(key + "の人口は、" + value);
		}
	}

}
