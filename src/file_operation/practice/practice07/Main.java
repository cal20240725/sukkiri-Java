package file_operation.practice.practice07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//気温データをArrayListで持てるように宣言する
		List<TempData> ltd = new ArrayList<>();
		
		//CSVファイル操作をするクラスのインスタンス化
		CsvReader csvr = new CsvReader();
		
		//CSVファイルの読み込みを行うメソッドを呼ぶ
		csvr.CsvFileReader(ltd);
		
		//「月日　平均気温　最高気温　最低気温」を順番に表示
		for(TempData tempdata : ltd) {
			System.out.println(tempdata.strDate() + " " + "平均気温：" + tempdata.getAveTemp() + " " + 
		"最高気温：" + tempdata.getMaxTemp() + " " + "最低気温：" + tempdata.getMinTemp());
			/*別のやり方
			System.out.printf("%s 平均気温：%5.2f 最高気温：%5.2f 最低気温：%5.2f\n",
					tempdata.strDate(), tempdata.getAveTemp(),tempdata.getMaxTemp(), tempdata.getMinTemp());
			*/
		}
		
	}

}
