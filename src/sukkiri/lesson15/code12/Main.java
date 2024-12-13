package sukkiri.lesson15.code12;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		//Calender型の現在時刻を取得
		Calendar c = Calendar.getInstance();//現在時刻を持ったCalenderインスタンスを作成
		System.out.println("cの値：" + c);
		
		
		//Calender型変数cに特定の日時を代入
		c.set(2023, 8, 18, 5, 53, 20);
		System.out.println("cの値：" + c);
		
		
		//月を9(10月)に変更
		c.set(Calendar.MONTH, 9);
		System.out.println("cの値：" + c);
		
		
		//Date型に変換し、Date型変数dに代入
		Date d = c.getTime();
		System.out.println("d:" + d);
		
		
		//Date型の現在時刻を取得
		Date now = new Date();
		System.out.println("now:" + now);
		//Date型時刻をCalender型にし、Calender型変数cを更新
		c.setTime(now);
		System.out.println("cの値：" + c);
		
		//年を取り出す
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
