package file_operation.practice.practice06;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		CsvOperation csvo = new CsvOperation();

		ArrayList<Animal> ala = new ArrayList<>();

		//既存のファイルを読み込み、インスタンス生成後、alaに追加
		ala = csvo.CsvFileReader();

		//リストの要素を表示
		for(Animal animal : ala) {
			animal.show();
		}

		//リストの要素をファイルに書き込み
		int result = csvo.CsvFileWriter(ala, "AnimalData3.txt");

		//書き込みの判定
		if(result == 1) {
			System.out.println("書き込みました");
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("書き込みできませんでした");
		}

		//alaを空にする
		//ala = null;
		ala.clear();

		//System.out.println(ala);

		//書き込んだファイルを読み込み、リストに格納
		ala = csvo.CsvFileReader("AnimalData3.txt");

		//リストの要素を表示
		for(Animal animal : ala) {
			animal.show();
		}

	}

}
