package sukkiri.practice.practice_print10.practice01;

public class Animal {
	//フィールド
	final String livingBeings = "動物";
	String kind;
	
	//引数なしのコンストラクタ
	public Animal() {
		System.out.println(this.livingBeings + "が生成されました");
	}
	
	//引数1つのコンストラクタ
	public Animal(String kind) {
		this.kind = kind;
		System.out.println("種は" + this.kind + "のインスタンスが生成されました");
	}
	
	//showProfileメソッド
	public void showProfile() {
		System.out.println("カテゴリは" + this.livingBeings);
	}
	
	//getter
	public String getKind() {
		return this.kind;
	}
	
	//setter
	public void setKind(String kind) {
		this.kind = kind;
	}

}
