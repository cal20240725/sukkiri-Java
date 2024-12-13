package sukkiri.practice.practice_print10.practice01;

public class Dog extends Animal {
	//差分フィールド
	String name;
	String cry;
	
	//引数2つのコンストラクタ
	public Dog(String name, String cry) {
//		super.setKind("犬");
		super("犬"); //模範解答
		this.name = name;
		this.cry = cry;
	}
	
	//showProfileメソッドをオーバーライド
	@Override
	public void showProfile() {		
		System.out.println("-------------------");
//		super.showProfile();
		System.out.println("カテゴリは" + super.livingBeings); //模範解答
//		System.out.println("種は" + super.getKind());
		System.out.println("種は" + super.kind); //模範解答
		System.out.println("名前は" + this.name);
		System.out.println("鳴き声は" + this.cry);		
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public String getCry() {
		return this.cry;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setCry(String cry) {
		this.cry = cry;
	}

}
