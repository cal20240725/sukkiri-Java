package sukkiri.object_oriented.sample01;

public class Main {
	public static void main(String[] args) {
		//①インスタンス生成
		Animal dog = new Animal("ポチ", 3);
		//②インスタンスフィールドにアクセス
//		dog.getName();
		System.out.println(dog.getName());		
//		dog.getAge();
		System.out.println(dog.getAge());
		
		//②インスタンスメソッドにアクセス
		dog.show();
		
		//"たま, 5"のフィールド情報を持つAnimalインスタンスを生成し、変数catに代入
		Animal cat = new Animal("たま", 5);
		
		//変数catのフィールド変数ageの値を7にセット
		cat.setAge(7);
		//変数catのshowメソッドの呼び出し
		cat.show();
		
		System.out.println(dog);
		System.out.println(cat);
	}

}
