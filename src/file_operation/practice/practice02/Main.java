package file_operation.practice.practice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 読み込むファイルを指定
		//String filepath = "C:\\pleiades\\2023-12\\workspace\\sukkiri\\file\\AnimalData.txt"; //絶対パス
		String filepath = "file\\AnimalData.txt"; //相対パス

		// 書き込むファイルを指定
		//String filepath2 = "C:\\pleiades\\2023-12\\workspace\\sukkiri\\file\\AnimalData2.txt"; //絶対パス
		String filepath2 = "file\\AnimalData2.txt"; //相対パス

		// try-with-resources 文を使ってファイルを開く
		try (   //BufferedReaderのインスタンスを生成
				BufferedReader br = new BufferedReader(new FileReader(filepath)); //1行でまとめる書き方
				//BufferedWriterのインスタンスを生成
				BufferedWriter bw = new BufferedWriter(new FileWriter(filepath2));) { //1行でまとめる書き方
			String line;
			// AnimalData.txtを読み込み、AnimalData2.txtに書き込み
			while ((line = br.readLine()) != null) {
					bw.write(line); // ファイルに書き込み
					bw.newLine(); // 改行
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}

	}

}
