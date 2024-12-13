package sukkiri.lesson15.code11;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		//現在の日時を取得
		Date now = new Date();//現在時刻を待ったDateインスタンスを作成
		System.out.println("Date型変数now:" + now);
		
		//Date型変数.getTime()：Date型変数がもっている時刻をミリ秒にする
		System.out.println("Date型変数nowをgetTime()でミリ秒にしたもの" + now.getTime());
		
		//ある時の日時を取得
		Date past = new Date(1694984000000L);
		System.out.println("Date型変数past:" + past);
	}

}
