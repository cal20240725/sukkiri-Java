package sukkiri.object_oriented.inter_face.sample01;

public class Main {
	public static void main(String[] args) {
		//インタフェースを実装したクラスのインスタンス生成
		Dog dog = new Dog("ポチ");
		
		//実装したインスタンスメソッドの呼出し
		dog.run();
		
		//デフォルトメソッドの呼出し
		dog.showLivingBeing();
		
	}

}
