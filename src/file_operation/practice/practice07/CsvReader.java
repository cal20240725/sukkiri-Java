package file_operation.practice.practice07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CsvReader {
	//フィールド
	private final String FILE_PATH; //読込むファイルパスを持つ

	//コンストラクタ
	public CsvReader() {
		String working_directory = System.getProperty("user.dir");
		//FILE_PATHに、TempData.csvのファイルパスを代入する
		FILE_PATH = working_directory + "\\file\\TempData.csv";
	}

	//メソッド
	public void CsvFileReader(List<TempData> ltd) {
		//「yyyy/MM/dd」の書式フォーマットを宣言する
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");

		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));){
			String line;
			// ファイルを1行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				//CSVファイルの先頭に「#」の付いた行は、読み込まない条件文
				if(line.charAt(0) != '#') { //#がある場合 //line.startsWith("#")自分の考え
					//CSVファイルは「日付,平均気温,最高気温,最低気温」の形でデータが作られているので、
					//splitを使って列ごとにデータを分割
					String[] words = line.split(",");
					//TempDataクラスのコンストラクタに値を渡し、インスタンスを生成した後、Listに追加する
					Date date = f.parse(words[0]);
					double aveTemp = Double.parseDouble(words[1]);
					double maxTemp = Double.parseDouble(words[2]);
					double minTemp = Double.parseDouble(words[3]);
					TempData tempdata = new TempData(date, aveTemp, maxTemp, minTemp);
					ltd.add(tempdata);						
					}
				}
		//ファイル操作（IOException）
		} catch(IOException ex) {
			ex.printStackTrace();
		//日付変換（ParseException）
		} catch(ParseException pe) {
			pe.printStackTrace();
		}
	}

}
