package file_operation.practice.practice06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvOperation {
	//定数フィールド
	private final String filepath;

	//引数1つのコンストラクタ
	public CsvOperation() {
		//定数filepathに「file\\AnimalData.txt」を代入
		filepath = "file\\AnimalData.txt";
	}

	//CsvFileReaderメソッド
	//固定のファイルを読み込み
	public ArrayList<Animal> CsvFileReader() {
		//Animal型ArrayListインスタンスを生成
		ArrayList<Animal> ala = new ArrayList<Animal>();
		// try-with-resources 文を使ってファイルを開く
		try (   //BufferedReaderのインスタンスを生成
				BufferedReader br = new BufferedReader(new FileReader(this.filepath));) {
			String line;
			// ファイルを1行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				//AnimalData.txtの内容を1行ずつ読み取り、各行「,」で分割
				String[] words = line.split("[,]");
				//String name = words[0]; //模範解答
				//String kind = words[1]; //模範解答
				//int age = Integer.parseInt(words[2]); //模範解答
				//Animalクラスのインスタンスを生成し、コンストラクタに渡す
				Animal animal = new Animal(words[0], words[1], Integer.parseInt(words[2]));
				//Animal animal = new Animal(name, kind, age); //模範解答
				//それをAnimal型ArrayListインスタンスに加え
				ala.add(animal);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
		//それを返す
		return ala;
	}
	
	//CsvFileReaderメソッドをオーバーロード
	//引数で指定したファイルの読み込み
	public ArrayList<Animal> CsvFileReader(String addedfp) {
		//Animal型ArrayListインスタンスを生成
		ArrayList<Animal> ala = new ArrayList<Animal>();
		
		//パス+ファイル名
		addedfp = "file\\" + addedfp;

		// try-with-resources 文を使ってファイルを開く
		try (   //BufferedReaderのインスタンスを生成
				BufferedReader br = new BufferedReader(new FileReader(addedfp));) {
			String line;
			// ファイルを1行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				//AnimalData.txtの内容を1行ずつ読み取り、各行「,」で分割
				String[] words = line.split("[,]");
				//String name = words[0]; //模範解答
				//String kind = words[1]; //模範解答
				//int age = Integer.parseInt(words[2]); //模範解答
				//Animalクラスのインスタンスを生成し、コンストラクタに渡す
				Animal animal = new Animal(words[0], words[1], Integer.parseInt(words[2]));
				//Animal animal = new Animal(name, kind, age); //模範解答
				//それをAnimal型ArrayListインスタンスに加え
				ala.add(animal);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
		//それを返す
		return ala;
	}
	
	//引数で指定したファイルの書き込み
	public int CsvFileWriter(ArrayList<Animal> ala, String addedfp) {
		//変数countの初期化
		int count = 0;
		//パス+ファイル名
		addedfp = "file\\" + addedfp;
		
		//ファイルに書き込み
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(addedfp));){
			for(Animal animal : ala) {
				bw.write(animal.getName() + "," + animal.getKind() + "," + animal.getAge());
				bw.newLine();
			}
			
			count++;
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}		
		return count;
	}

}
