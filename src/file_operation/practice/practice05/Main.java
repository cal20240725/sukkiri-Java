package file_operation.practice.practice05;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//CsvOperationインスタンスを生成する
		CsvOperation co = new CsvOperation();
		
		//Animal型ArrayListインスタンスを生成する
		ArrayList<Animal> aa = new ArrayList<Animal>();
		
		//CSVファイルの呼び出しを行い、戻り値をAnimal型ArrayListインスタンスに格納
		aa = co.CsvFileReader();
		
		//全件表示
		for(Animal animal : aa) {
			animal.show();
		}
		
	}

}
