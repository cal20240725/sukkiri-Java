package variousClass.nestedClass.practice.practice01;

public class Person {
	//フィールド
	private String name;
	private int age;

	//コンストラクタ
	private Person() {
		//処理がないコンストラクタ
	}

	//　builderメソッド　※staticメソッド
	public static PersonBuilder builder() {
		//処理内容はPersonBuilderインスタンスを生成し、そのインスタンスを返す
		return new PersonBuilder();
	}

	//getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	//内部クラス： PersonBuilder　※staticクラス
	static class PersonBuilder {
		//フィールド
		private String name;
		private int age;

		//nameメソッド
		public PersonBuilder name(String name) {
			//内部クラスのフィールドに引数をセットし、自分自身のインスタンスを返す
			this.name = name;
			return this;
		}

		//ageメソッド
		public PersonBuilder age(int age) {
			//内部クラスのフィールドに引数をセットし、自分自身のインスタンスを返す
			this.age = age;
			return this;
		}
		
		//buildメソッド
		public Person build() {
			//外部クラスのインスタンスを生成後、内部クラスのフィールド内容を外部クラスの
			//インスタンスフィールドにセットし、生成されたインスタンスを返す
			Person person = new Person();
			person.name = this.name;
			person.age = this.age;
			return person;
		}
	}

}
