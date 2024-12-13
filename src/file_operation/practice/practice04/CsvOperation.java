package file_operation.practice.practice04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvOperation {
	//定数フィールド
	private final String filepath;

	//引数1つのコンストラクタ
	public CsvOperation() {
		//定数filepathに「file\\AnimalData.txt」を代入
		filepath = "file\\AnimalData.txt";
	}

	//CsvFileReaderメソッド
	public void CsvFileReader() {
		//引数、戻り値なしで、AnimalData.txtの内容を1行ずつ読み取る処理を記述
		// try-with-resources 文を使ってファイルを開く
		try (   //BufferedReaderのインスタンスを生成
				BufferedReader br = new BufferedReader(new FileReader(this.filepath));) {
			String line;
			// ファイルを 1 行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				// １行表示
				System.out.println(line);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
	}

}
