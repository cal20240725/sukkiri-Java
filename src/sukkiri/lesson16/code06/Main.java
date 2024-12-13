package sukkiri.lesson16.code06;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		//HashMapインスタンスの作成
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		//ペアをHashMapインスタンスに格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);//ペアで格納
		prefs.put("熊本県", 181);
		//getメソッドの利用：引数にkeyを渡し、valueを取得
		int tokyo = prefs.get("東京都");//キーを指定し値を取得
		System.out.println("東京都の人口は、" + tokyo);
		
		//removeメソッドの利用：引数にkeyを渡し、そのペアの削除
		prefs.remove("京都府");
		
		System.out.println("putメソッドを呼び出す前：" + prefs.get("熊本県"));
		
		//putメソッド(すでにkeyが存在する場合)：valueの上書き
		prefs.put("熊本県", 182);//値を182で上書き
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
	}

}
