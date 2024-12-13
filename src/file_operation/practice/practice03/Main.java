package file_operation.practice.practice03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void csvFileReader() {
		// 読み込むファイルを指定
		String filepath = "C:\\pleiades\\2023-12\\workspace\\sukkiri\\file\\AnimalData.txt"; //絶対パス
		//String filepath = "file\\AnimalData.txt"; //相対パス

		// try-with-resources 文を使ってファイルを開く
		try (   //BufferedReaderのインスタンスを生成
				BufferedReader br = new BufferedReader(new FileReader(filepath));) {
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

	public static void main(String[] args) {
		csvFileReader();

	}

}
