package sukkiri.lesson15.code13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//書式「2023/09/18 05:53:20」を設定
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//SimpleDateFormat ff = new SimpleDateFormat("yyyy年MM月dd日(F) HH:mm:ss");
		
		//文字列をDate型に変換 -> parseメソッド
		//SimpleDateFormat型変数.parse()で引数の日時をDate型に変換
		Date d = f.parse("2023/09/18 05:53:20");
		System.out.println(d);
		
		//Date型を文字列に変換 -> formatメソッド
		//Date型で現在時刻を取得
		Date now = new Date();
		//SimpleDateFormat型変数.format()で引数の日時を文字列に変換
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
	}

}
