package sukkiri.practice.practice_print15_02.practice04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		/*
		Dateクラスを使用して現在の日時を実行結果の形式で表示してください。
		実行結果例
		2023年01月09日（月） 09時05分03秒
		*/
		
		//現在日時の取得
		Date now = new Date();
		
		//指定された書式に変換
		//SimpleDateFormatインスタンスの作成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E) HH時mm分ss秒");
		
		//変数処理
		String date = sdf.format(now);
		
		//表示
		System.out.println(date);

	}

}
