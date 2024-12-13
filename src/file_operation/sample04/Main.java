package file_operation.sample04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 書き込むファイルを指定
		String filepath = "data.txt";
		
		// 変数宣言（close 処理のため try の外で宣言）
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// FileWriter のインスタンス生成
			fw = new FileWriter(filepath);
			// BufferedWriter のインスタンス生成
			bw = new BufferedWriter(fw);
			// 書き込みを繰り返す
			for(int i=0;i<5;i++) {
				bw.write("[" + i + "]");// ファイルに書き込み
				bw.newLine(); //改行
			}
		} catch (IOException e) {
			// IOException の例外処理
			e.printStackTrace();
		} finally {
			// finally は必ず実行される
			try {
				// BufferedWriter のクローズ処理
				bw.close();
			} catch (IOException e) {
				// IOException の例外処理
				e.printStackTrace();
			}
			try {
				// FileWriter のクローズ処理
				fw.close();
			} catch (IOException e) {
				// IOException の例外処理
				e.printStackTrace();
			}
		}


	}

}
