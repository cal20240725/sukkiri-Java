package sukkiri.practice.practice_print15_02.practice05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		/*
		Calendarクラスを使用して現在の日時を実行結果の形式で表示してください。
		実行結果例
		2023年01月09日（月） 09時05分03秒
		*/
		
		//Calendarクラスで現在日時の取得
		Calendar c = Calendar.getInstance();
		
		//Calendar型変数cからDateインスタンスの作成
		Date d = c.getTime();
		
		//Date型をString型に変換
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E) HH時mm分ss秒");
		
		//変換
		String now = sdf.format(d);
		
		//表示
		System.out.println(now);

	}

}
