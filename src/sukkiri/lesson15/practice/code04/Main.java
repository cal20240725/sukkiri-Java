package sukkiri.lesson15.practice.code04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		//現在の日時をDate型で取得
		Date now = new Date();
		//System.out.println(now);
		
		//取得した日時をCalendarにセット
		//Calendar型インスタンスの作成
		Calendar c = Calendar.getInstance();
		
		//Date型の日時情報をCalendar型にセット
		c.setTime(now);
		
		//Calendarから「日」
		int day = c.get(Calendar.DAY_OF_MONTH);
		//System.out.println(day);
		
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		//c.add(Calendar.DAY_OF_MONTH, 100);
		
		Date d = c.getTime();
		
		SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
		
		String date = fmt.format(d);
		System.out.println(date);
		
	}

}
