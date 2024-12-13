package variousClass.nestedClass.staticNestedClass.example01;

public class Main {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass(); //外部クラスのインスタンスの生成
		// InnerClass のインスタンスを外部クラスのインスタンスから生成
		OuterClass.InnerClass inner = outer.new InnerClass();

		outer.outerMethod(); // 外部クラスのメソッド呼び出し
		inner.modifyOuterField(42); //外部クラスのフィールドを変更するメソッド
		outer.outerMethod(); // 更新された外部クラスのメソッド呼び出し
	}
}
class OuterClass {
	private int outerField = 10; //外部クラスフィールド
	class InnerClass {
		void modifyOuterField(int newValue) {
			outerField = newValue; // 外部クラスのフィールドを変更
			System.out.println("InnerClass: Modified outerField = " + outerField);
		}
	}
	void outerMethod() {
		System.out.println("OuterClass: outerField = " + outerField);
	}
}
