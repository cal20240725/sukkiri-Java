package db_operation.practice_print.practice08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//インスタンスの生成
		Scanner sc = new Scanner(System.in);
		DbOperation dbo = new DbOperation();
		ArrayList<Kakeibo> alk = new ArrayList<>();

		//入力受付
		System.out.print("日付  ：");
		String date = sc.nextLine();
		Date ddate = formatter(date);

		//データ変更処理
		dbo.connect();
		int count = dbo.delete(ddate);
		dbo.disconnect();

		//成功かどうかを表示
		if(count == 0) {
			System.out.println("削除できませんでした");
		} else {
			System.out.println("削除しました");
		}

		dbo.connect();
		alk = dbo.select();
		dbo.disconnect();

		//表示
		for(Kakeibo k : alk) {
			k.show();
		}

	}

	public static Date formatter(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//返還後、return
			Date udate = sdf.parse(strDate);

			return udate;
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		//変換失敗後、return
		return new Date();
	}

}

